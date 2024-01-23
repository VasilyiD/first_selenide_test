import com.codeborne.selenide.Condition;
import com.codeborne.selenide.conditions.Text;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class FirstSelenideTest {

    @Test
    void junitExampleCodeIsOnPage() {


        open("https://github.com/selenide/selenide");
        $("[id=wiki-tab]").click();
        $("#wiki-pages-filter").setValue("SoftAssertions");
        $("[data-filterable-for= wiki-pages-filter]").$(byText("SoftAssertions")).click();
        $(".markdown-body").shouldHave(text("Using JUnit4 just describe rule inside test class"));

    }
}
