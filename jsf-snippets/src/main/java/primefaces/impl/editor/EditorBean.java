package primefaces.impl.editor;

import javax.faces.bean.ManagedBean;
 
@ManagedBean(name = "editorBean")
public class EditorBean {
 
    private String value = "This editor is provided by PrimeFaces";
 
    public String getValue() {
        return value;
    }
 
    public void setValue(String value) {
        this.value = value;
    }
}
