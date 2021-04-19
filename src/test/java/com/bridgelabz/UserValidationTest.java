package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserValidationTest {
    private Assertions Assert;

    /**
     * @method testValidateFirstName test Happy case for first name
     * @Test take a correct input where first latter is Cap
     * @return true
     */

    @Test
    public void testValidateFirstName() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validateFirstName("Abhijeet");
        Assert.assertEquals(true, result);
    }

    /**
     * @method testInvalidFirstName test Sad case for first name
     * @Test take a wrong input where first latter is not Cap
     * @return false
     */

    @Test
    public void testInvalidFirstName() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validateFirstName("abc");
        Assert.assertEquals(false, result);
    }

    /**
     * @method testShortFirstName test Sad case for first name
     * @Test take a wrong input where first latter is not Cap and we take only two Character
     * @return false
     */

    @Test
    public void testShortFirstName() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validateFirstName("ab");
        Assert.assertEquals(false, result);
    }

    //LastName
    /**
     * @method testValidateLastName test Happy case for last name
     * @Test take a correct input where first latter is Cap
     * @return true
     */

    @Test
    public void testValidateLastName() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validateLastName("Kale");
        Assert.assertEquals(true, result);
    }

    /**
     * @method testInvalidLastName test Sad case for last name
     * @Test take a wrong input where first latter is not Cap
     * @return false
     */

    @Test
    public void testInvalidLastName() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validateLastName("Sgh");
        Assert.assertEquals(false, result);
    }

    /**
     * @method testShortLastName test Sad case for last name
     * @Test take a wrong input where first latter is not Cap and we take only two Character
     * @return false
     */

    @Test
    public void testShortLastName() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validateLastName("Sg");
        Assert.assertEquals(false, result);
    }

    //Phone Number
    /**
     * @method testValidPhoneNumber test Happy case for phoneNo
     * @Test take right input where we mention country code then a space and then 10 digit phoneNo
     * @return true
     */

    @Test
    public void testValidPhoneNumber() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validatePhoneNumber("91 9423628329");
        Assert.assertEquals(true, result);
    }

    /**
     * @method testInvalidNoSpacePhoneNumber test sad case for phoneNo
     * @Test take wrong input where we mention country code but donot give a space between country code and 10 digit phoneNo
     * @return false
     */

    @Test
    public void testInvalidNoSpacePhoneNumber() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validatePhoneNumber("9423628329");
        Assert.assertEquals(false, result);
    }

    /**
     * @method testInvalidShortPhoneNumber test sad case for phoneNo
     * @Test take wrong input where we mention country code then a space and then  less then 10 digit phoneNo
     * @return false
     */

    @Test
    public void testInvalidShortPhoneNumber() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validatePhoneNumber("90 94236283");
        Assert.assertEquals(false, result);
    }

    /**
     * @method testInvalidShortPhoneNumber test sad case for phoneNo
     * @Test take wrong input where we mention 10 digit phoneNo without country code
     * @return false
     */

    @Test
    public void testInvalidWithoutCountryCodePhoneNumber() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validatePhoneNumber("9423628329");
        Assert.assertEquals(false, result);
    }

    /**
     * @method testvalidPassword test sad case for phoneNo
     * @test (follow all the 4 rules)
     * Rule-1 Minimum 8 character
     * Rule-2 At least one Upper case
     * Rule-3  At least one Numeric value
     * Rule-4 at least one Special character
     * @return true
     */

    @Test
    public void testValidPassword() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validatePassword("Abhi@123");
        Assert.assertEquals(true, result);
    }

    /**
     * @method testvalidPassword test sad case for phoneNo
     * @test skip Rule1
     * Rule-1 Minimum 8 character
     * Rule-2 At least one Upper case
     * Rule-3  At least one Numeric value
     * Rule-4 at least one Special character
     * @return false
     */

    @Test
    public void testInvalidShortPassword() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validatePassword("Abhi@");
        Assert.assertEquals(false, result);
    }

    /**
     * @method testvalidPassword test sad case for phoneNo
     * @test skip Rule2
     * Rule-1 Minimum 8 character
     * Rule-2 At least one Upper case
     * Rule-3  At least one Numeric value
     * Rule-4 at least one Special character
     * @return false
     */

    @Test
    public void testInvalidSkipUpperCasePassword() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validatePassword("032@abhi");
        Assert.assertEquals(false, result);
    }

    /**
     * @method testvalidPassword test sad case for phoneNo
     * @test skip Rule3
     * Rule-1 Minimum 8 character
     * Rule-2 At least one Upper case
     * Rule-3  At least one Numeric value
     * Rule-4 at least one Special character
     * @return false
     */

    @Test
    public void testInvalidSkipNumericValuePassword() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validatePassword("Abhi@@33");
        Assert.assertEquals(false, result);
    }

    /**
     * @method testvalidPassword test sad case for phoneNo
     * @test skip Rule4
     * Rule-1 Minimum 8 character
     * Rule-2 At least one Upper case
     * Rule-3  At least one Numeric value
     * Rule-4 at least one Special character
     * @return false
     */

    @Test
    public void testInvalidSkipSpecialCharacterPassword() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validatePassword("Abhi33@");
        Assert.assertEquals(false, result);
    }
}
