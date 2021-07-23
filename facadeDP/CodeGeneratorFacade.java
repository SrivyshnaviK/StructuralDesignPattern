package com.Vyshnavi.facadeDP;


public class CodeGeneratorFacade {
    public static void generateCode(LanguageType languageType,String requiredCode){
        CodeWriter codeWriter=new CodeWriter();
        switch (languageType){
            case C:codeWriter.writeCode("C",requiredCode);
            break;
            case Java:codeWriter.writeCode("Java",requiredCode);
            break;
            case Python:codeWriter.writeCode("Python",requiredCode);
            break;
            default:
                System.out.println("Language Not Available:(");
        }

    }
}
