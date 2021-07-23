package com.Vyshnavi.facadeDP;

import java.util.Scanner;

public class FacadeDP {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Required Code:");
        String requiredCode=scanner.next();
        CodeGeneratorFacade.generateCode(LanguageType.C,requiredCode);
        CodeGeneratorFacade.generateCode(LanguageType.JS,requiredCode);
    }
}