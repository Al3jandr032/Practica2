
package com.ipn.webclient.form;

import com.sun.corba.se.spi.orbutil.fsm.Input;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Al3x
 */
public class FormBuilder {
    private StringBuilder sb;
    private List<FormInput> inputs;
    private String submit;

    public FormBuilder(String submit) {
        this.submit = submit;
    }

    public List<FormInput> getInputs() {
        return inputs;
    }

    public void setInputs(List<FormInput> inputs) {
        this.inputs = inputs;
    }

    @Override
    public String toString() {
        sb = new StringBuilder();
        sb.append("<form>");
        for (FormInput input : inputs) {
            sb.append(input.toString());
        }
        sb.append("<input type=\"").append(FormInput.SUBMIT_INPUT_TYPE).append("\" value=\"").append(this.submit).append("\">");
        sb.append("</form>");
        return sb.toString();
    }
    
    public static void main(String[] args) {
        FormBuilder builder = new FormBuilder("crear");
        ArrayList<FormInput> lst = new ArrayList<>();
        lst.add(new FormInput("name","Nombre"));
        lst.add(new FormInput("apellido","Apellido materno"));
        lst.add(new FormInput("edad","Edad"));
        builder.setInputs(lst);
        System.out.println(builder);
    }
}
