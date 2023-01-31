package com.yymagicer.core;

/**
 * @ClassName Main
 * @Description
 * @Author yangxd
 * @Date 2021/5/7 10:00
 * @Version 1.0
 **/
public class Main {

    public static void main(String[] args) {
        PasswordCrackService service = new ThreadProcessPasswordCrackServiceImpl();
        String source = "D:\\Workspace_idea\\123.zip";
        String dest = "D:\\Workspace_idea\\";
        service.run(source, dest);
    }
}
