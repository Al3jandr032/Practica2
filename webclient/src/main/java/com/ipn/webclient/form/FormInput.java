
package com.ipn.webclient.form;

/**
 *
 * @author Al3x
 */
public class FormInput {
    private String name;
    private String label;
    public static final String INPUT_TYPE = "text";
    public static final String SUBMIT_INPUT_TYPE = "submit";

    public FormInput(String name,String label) {
        this.name = name;
        this.label = label;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.label).append("<br>");
        sb.append("<input type=\"").append(FormInput.INPUT_TYPE).append("\" name=\"").append(this.name).append("\">");
        return sb.toString();
    }
    
    
}
