package git1;

import org.junit.jupiter.api.Test;


import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class SearchTest {
    @Test
    void TestT(){
        open("https://github.com/Antosha001/project1");
       $("[AppHeader-search]").setValue("sele");
    }
}
