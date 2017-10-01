package com.xingguang.utils;

import javax.crypto.spec.SecretKeySpec;
import javax.xml.bind.DatatypeConverter;
import java.security.Key;
import io.jsonwebtoken.*;
import java.util.Date;
import java.util.Map;

/**
 * Created by admin on 2017/9/30.
 */
public class JwtUtils {

    private static Key getKeyInstance(){
        //The JWT signature algorithm we will be using to sign the token
        SignatureAlgorithm signatureAlgorithm = SignatureAlgorithm.HS256;
        //We will sign our JWT with our ApiKey secret
        byte[] apiKeySecretBytes = DatatypeConverter.parseBase64Binary("1234");
        Key signingKey = new SecretKeySpec(apiKeySecretBytes, signatureAlgorithm.getJcaName());
        return signingKey;
    }

    //Sample method to construct a JWT
    public static String createJWT(String issuer, String subject, long ttlMillis) {
        long nowMillis = System.currentTimeMillis();
        Date now = new Date(nowMillis);

        //Let's set the JWT Claims
        JwtBuilder builder = Jwts.builder()
                .setHeaderParam("typ","JWT")
                //.setId(id)
                //.setIssuedAt(now)
                .setIssuer(issuer)
                .setSubject(subject)
                .signWith(SignatureAlgorithm.HS256, getKeyInstance());

        //if it has been specified, let's add the expiration
        if (ttlMillis >= 0) {
            long expMillis = nowMillis + ttlMillis;
            Date exp = new Date(expMillis);
            builder.setExpiration(exp);
        }

        //Builds the JWT and serializes it to a compact, URL-safe string
        return builder.compact();
    }

    //Sample method to validate and read the JWT
    public static Map<String, Object> parseJWT(String jwt) {
        try {
            Map<String, Object> jwtClaims = Jwts.parser().setSigningKey(getKeyInstance()).parseClaimsJws(jwt).getBody();
            return jwtClaims;
        } catch (Exception e) {
            return null;
        }
    }

    public static void main(String [] args){
        String jwt = JwtUtils.createJWT("work.xingguanqb.com","bbb",100000);
        System.out.println(jwt);
        Map<String,Object> map = JwtUtils.parseJWT(jwt);
        System.out.println(map);
    }

}
