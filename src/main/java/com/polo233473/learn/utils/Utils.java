package com.polo233473.learn.utils;

import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Utils {
    public static Identifier id(String namespace, String path){
        return new Identifier(namespace,path);
    }

    public static Identifier id(Object object){
        String namespace = "learn";
        String path=object.getClass().getSimpleName();
        StringBuilder sb = new StringBuilder(path);
        for(int i=1;i<sb.length();i++){
            if (cTa(sb.charAt(i))>=cTa('A') && cTa(sb.charAt(i))<= cTa('Z')){
                sb.insert(i,'_');
                i++;
            }
        }
        path=sb.toString();
        path=path.toLowerCase();
        return new Identifier(namespace,path);
    }

    public static Identifier id(String id){
        return new Identifier(id);
    }

    public static <V, T extends V> void register(Registry<V> registry, T entry){
        Registry.register(registry, id(entry), entry);
    }

    private static int cTa(char c){//char to ascii
        return c;
    }
}
