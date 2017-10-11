/**
 * Created by hedaliang on 2017/10/11.
 */
//实现取值
var VueFormSub = function(formid){
    this.$form = ($("#" + formid).length !=0)?$("#" + formid):$("."+formid);
    var models = $("*[v-model != '']", this.$form);
    var vueData = {};
    $.each(models,function(idx,dom){
        var type = $(dom).attr("type");
        var key = $(dom).attr("name");
        if (undefined != key){
            var dValue = $(dom).val();
            $(dom).val(dValue);

            if(type=="text" || type=="hidden"){
                vueData[key] = dValue;
            }else if(type == "radio"){
                vueData[key] = $("input[type='radio'][name='"+key+"']:checked").val();
            }


            /*var beanName = key.split("_");
            if(beanName.length < 2){
                vueData[beanName] = dValue;
                vueData[beanName] = $("input[type='radio'][name='"+key+"']:checked").val();

            }else{
                if(vueData[beanName[0]] == undefined){
                    vueData[beanName[0]] = {};
                }else{
                    if($(dom).attr("type") == "radio"){
                        var tempVal = $("input[type='radio'][name='"+key+"']:checked").val();
                        vueData[beanName[0]][beanName[1]] = tempVal;
                    }else{
                        vueData[beanName[0]][beanName[1]]=dValue;
                    }
                }
            }*/
        }
    });
    return vueData;
};

//初始化Vue表单数据(可以只传入initDate数据源，formid需要绑定的dom)
VueFormSub.initVue = function(initDate,formid,httpMethod, url, params){
    if(initDate instanceof Object){
        /*if(initDate.length !=0){}*/
        var initJson = VueFormSub.ObjConvert(initDate);
        new Vue({
            el : ($("#"+formid).length != 0)?'#'+formid:'.'+formid,
            data : initJson
        });
    }else{
        if (httpMethod != "get" && params && typeof (params) == "object"){
            params = JSON.stringify(params);
        }
        if(params!= null){
            params.rs = Math.random();
        }else{
            params = {'rs':Math.random()};
        }
        $.ajax({
            type: httpMethod,
            url: "/cxh" + url,
            data: params,
            cache:false,
            async: true,
            contentType: 'application/json',
            dataType: 'json',
            success: function (returnData) {
                if(returnData.length != 0){
                    var vueDate = VueFormSub.ObjConvert(returnData);
                    new Vue({
                        el:($("#"+formid).length != 0)?'#'+formid:'.'+formid,
                        data : vueDate
                    });
                }
            }
        });
    }
};

//对需要绑定的对象进行解析成Vue支持的格式
VueFormSub.ObjConvert = function(dataObj){
    var json = {};
    $.each(dataObj,function(id,param){
        if(param instanceof Object){
            $.each(param, function(rid,rparam){
                if(rparam instanceof Object){
                    json[id] = VueFormSub.ObjConvert(param);
                }else{
                    json[id+"_"+rid] = rparam;
                }
            });
        }else{
            json[id]=param;
        }
    });
    return json;
};