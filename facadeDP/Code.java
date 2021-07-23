package com.Vyshnavi.facadeDP;
public class Code {
    private CodeEnvironment codeEnvironment;
    private Libraries libraries;
    public void setCodeEnvironment(CodeEnvironment codeEnvironment) {
        this.codeEnvironment = codeEnvironment;
    }
    public void setLibraries(Libraries libraries) {
        this.libraries = libraries;
    }
    public CodeEnvironment getCodeEnvironment() {
        return codeEnvironment;
    }
    public Libraries getLibraries() {
        return libraries;
    }
    @Override
    public String toString() {
        return "Code{" +
                "codeEnvironment=" + codeEnvironment +
                ", libraries=" + libraries +
                '}';
    }
}