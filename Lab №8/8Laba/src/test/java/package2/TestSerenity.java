package package2;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class TestSerenity {

    String siteHomePage = "https://pn.com.ua/";

    @Steps
    StepsForSerenity stepsForSerenity;

    @Test
    public void verifySubCategory()
    {
        //given
        stepsForSerenity.a_user_visits_a_page(siteHomePage);
        //when
        stepsForSerenity.the_user_chooses_category_Holodos();
        //then
        stepsForSerenity.a_user_choose_holodos();
        //given
        stepsForSerenity.a_user_visit_equal_page();
        //when
        stepsForSerenity.a_user_see_equal_page();
    }

}
