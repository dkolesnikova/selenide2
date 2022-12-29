package guru.qa;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.text;



public class CheckUploadPageTest  {
    @Test
    void pageOpeningCheck () {
    open ("https://github.com");
    $$(".HeaderMenu-link").findBy(text("Solutions")).hover();
    $$(".HeaderMenu-dropdown-link").findBy(text("Enterprise")).click();
    $(".enterprise-hero").shouldHave(text("Build like the best"));

    }

    @Test
    void dragAndDrop () {
    open("https://the-internet.herokuapp.com/drag_and_drop");
    $("#column-a").dragAndDropTo($("#column-b"));
    $("#column-b header").shouldHave(text("A"));
    $("#column-a header").shouldHave(text("B"));
    }

}

