package com.Vyshnavi.facadeDP;

public class CodeWriter {
    Code code=new Code();
    CodeEnvironment codeEnvironment;
    Libraries libraries;
    public void writeCode(String string,String requiredCode){
        codeEnvironment= new CodeEnvironment(string);
        libraries=new Libraries(string);
        System.out.println("Setting "+string+" Language Environment..Hang on");
        code.setCodeEnvironment(codeEnvironment);
        System.out.println("Setting up "+string+" Libraries.. Almost Done");
        code.setLibraries(libraries);
        System.out.println(code.getCodeEnvironment());
        System.out.println(code.getLibraries());
        System.out.println(requiredCode+" Code Saved in '"+requiredCode+"."+string+"' file!!!");
    }
}