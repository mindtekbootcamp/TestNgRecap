package data;

import org.testng.annotations.DataProvider;

public class DataProvider1 {

    @DataProvider(name = "creatingAccount")
    public Object[][] data(){
        return new Object[][]{
                {"John", "Doe","abc@gmail.com","abc123456@"}
//                {"Li", "Clark","abc@gmail.com","abc123456@"},
//                {"Patel", "H.","abc@gmail.com","abc123456@"},
//                {"P", "H","abc@gmail.com","abc123456@"},
//                {"P", "Harsh","abc@gmail.com","abc123456@"},
//                {"Abc", "Abc","abc@gmail.com","abc123456@"}
        };
    }

}
