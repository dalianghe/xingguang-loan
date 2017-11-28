<!DOCTYPE>
<html>
<head>
    <title>星光钱包-业务员分布</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <script charset="utf-8" src="http://map.qq.com/api/js?v=2.exp"></script>
    <style type="text/css">
        *{
            margin:0px;
            padding:0px;
        }
        #map_canvas {
            min-width:100%;
            min-height:100%;
        }
    </style>
</head>
<body>
<div id="map_canvas"></div>
<!--[if !IE]> -->
<script src="/assets/js/jquery-2.1.4.min.js"></script>
<!-- <![endif]-->
<!--[if IE]>
<script src="/assets/js/jquery-1.11.3.min.js"></script>
<![endif]-->
<script type="text/javascript">
    if('ontouchstart' in document.documentElement) document.write("<script src='assets/js/jquery.mobile.custom.min.js'>"+"<"+"/script>");
</script>
<script type="text/javascript">

    var data = [
        /*[39.7157, 116.14099],
        [39.75017, 116.3179]*/
    ];
    jQuery(function($) {
        function $(a) {
            return document.getElementById(a);
        }
        var Map = qq.maps.Map;
        var Marker = qq.maps.Marker;
        var LatLng = qq.maps.LatLng;
        var Event = qq.maps.event;
        var Point = qq.maps.Point;
        var MVCArray = qq.maps.MVCArray;
        var MarkerCluster = qq.maps.MarkerCluster;
        var Cluster = qq.maps.Cluster;
        var MarkerDecoration = qq.maps.MarkerDecoration;
        var latlng = new LatLng(39.91, 116.38);
        var options = {
            'zoom':4,
            'center':latlng,
            'mapTypeId':"roadmap"
        };
        var map = new Map($('map_canvas'), options);
        var markers = new MVCArray();
        loadData(markers,LatLng,MarkerCluster,MarkerDecoration,Point,Marker,map);

    });

    function loadData(markers,LatLng,MarkerCluster,MarkerDecoration,Point,Marker,map){
        $.ajax({
            url: "/qrcode/all",
            type: "GET",
            contentType: "application/json",
            data : null,
            dataType: "json",
            timeout: 10000,
            success: function (result) {
                if(result.sysCode==0){
                    if(result.bizCode==0){
                        var datas = result.data;
                        for(var i=0;i<datas.length;i++){
                            var arr2 = [];
                            arr2.push(parseFloat(datas[i].lat));
                            arr2.push(parseFloat(datas[i].lng));
                            data.push(arr2);
                        }
                        marker(markers,LatLng,MarkerCluster,MarkerDecoration,Point,Marker,map);
                    }
                }
            },
            fail: function (err) {
                console.log(err)
            }
        })
    }

    function marker(markers,LatLng,MarkerCluster,MarkerDecoration,Point,Marker,map){
        for (var i = 0; i < data.length; i++) {
            var latLng = new LatLng(data[i][0], data[i][1]);
            var decoration = new MarkerDecoration(i, new Point(0, -5));
            var marker = new Marker({
                'position':latLng,
                map:map
            });
            markers.push(marker);
        }
        markerClusterer = new MarkerCluster({
            map:map,
            minimumClusterSize:2, //默认2
            markers:markers,
            zoomOnClick:true, //默认为true
            gridSize:30, //默认60
            averageCenter:true, //默认false
            maxZoom:18, //默认18
        });

        /*Event.addListener(markerClusterer, 'clusterclick', function (evt) {
            var ss =  evt;
            // alert('点击了聚合点');
        });*/
    }

</script>
</body>
</html>
