package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class EmailParametarizedTesting {
    String email;
    boolean expected;
    private Assertions Assert;

    public EmailParametarizedTesting(String email, boolean result) {
        this.email = email;
        this.expected = result;
    }
    // @Parameterized.Parameters
    public static List inputFirst() {
        List list = new ArrayList();
        list.add(new Object[]{"abc@yahoo.com",true});
        list.add(new Object[]{"abc-100@yahoo.com",true});
        list.add(new Object[]{"abc.100@yahoo.com",true});
        list.add(new Object[]{"abc111@abc.com",true});
        list.add(new Object[]{"abc-100@abc.net",true});
        list.add(new Object[]{"abc.100@abc.com.au",true});
        list.add(new Object[]{"abc@1.com",true});
        list.add(new Object[]{"abc@gmail.com.com",true});
        list.add(new Object[]{"abc+100@gmail.com",true});
        list.add(new Object[]{"abc",false});
        list.add(new Object[]{" abc@.com.my ",false});
        list.add(new Object[]{"abc123@gmail.a",false});//
        list.add(new Object[]{"abc123@.com",false});
        list.add(new Object[]{"abc123@.com.com",false});
        list.add(new Object[]{".abc@abc.com ",false});
        list.add(new Object[]{"abc()*@gmail.com",false});
        list.add(new Object[]{"abc@%*.com",false});
        list.add(new Object[]{"abc..2002@gmail.com ",false});
        list.add(new Object[]{"abc.@gmail.com",false});//
        list.add(new Object[]{"abc@abc@gmail.com",false});
        list.add(new Object[]{"abc@gmail.com.1a",false});
        list.add(new Object[]{"abc@gmail.com.aa.au",false});
        return list;
    }

    @Test
    public void validatePassword() {
        UserValidator userValidator = new UserValidator();
        Assert.assertEquals(this.expected,userValidator.validateEmail(this.email));
    }
}
