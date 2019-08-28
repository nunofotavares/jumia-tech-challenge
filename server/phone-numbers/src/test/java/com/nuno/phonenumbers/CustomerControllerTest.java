package com.nuno.phonenumbers;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.nuno.phonenumbers.config.DBConfig;
import com.nuno.phonenumbers.controller.CustomerController;

@RunWith(SpringRunner.class)
@WebMvcTest(value = CustomerController.class, secure = false)
public class CustomerControllerTest {
	
	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	private DBConfig config;
	
	@Before
	public void dbInit() {
		DBConfig.dbConnect();
	}
	
	@Test
	public void getAllEmployes_Test() throws Exception {
		
		RequestBuilder requestBuilder = MockMvcRequestBuilders.get(
				"/api/v1/customers").accept(
				MediaType.APPLICATION_JSON_VALUE);
		MvcResult result = mockMvc.perform(requestBuilder).andReturn();
		int status = result.getResponse().getStatus();
		assertEquals(200, status);
		String expected = "[{\"id\":0,\"name\":\"Walid Hammadi\",\"phone\":\"6007989253\",\"countryCode\":\"+212\",\"country\":\"Morocco\",\"state\":\"Not\"},{\"id\":1,\"name\":\"Yosaf Karrouch\",\"phone\":\"698054317\",\"countryCode\":\"+212\",\"country\":\"Morocco\",\"state\":\"Valid\"},{\"id\":2,\"name\":\"Younes Boutikyad\",\"phone\":\"6546545369\",\"countryCode\":\"+212\",\"country\":\"Morocco\",\"state\":\"Not\"},{\"id\":3,\"name\":\"Houda Houda\",\"phone\":\"6617344445\",\"countryCode\":\"+212\",\"country\":\"Morocco\",\"state\":\"Not\"},{\"id\":4,\"name\":\"Chouf Malo\",\"phone\":\"691933626\",\"countryCode\":\"+212\",\"country\":\"Morocco\",\"state\":\"Valid\"},{\"id\":5,\"name\":\"soufiane fritisse \",\"phone\":\"633963130\",\"countryCode\":\"+212\",\"country\":\"Morocco\",\"state\":\"Valid\"},{\"id\":6,\"name\":\"Nada Sofie\",\"phone\":\"654642448\",\"countryCode\":\"+212\",\"country\":\"Morocco\",\"state\":\"Valid\"},{\"id\":7,\"name\":\"Edunildo Gomes Alberto \",\"phone\":\"847651504\",\"countryCode\":\"+258\",\"country\":\"Mozambique\",\"state\":\"Valid\"},{\"id\":8,\"name\":\"Walla's Singz Junior\",\"phone\":\"846565883\",\"countryCode\":\"+258\",\"country\":\"Mozambique\",\"state\":\"Valid\"},{\"id\":9,\"name\":\"sevilton sylvestre\",\"phone\":\"849181828\",\"countryCode\":\"+258\",\"country\":\"Mozambique\",\"state\":\"Valid\"},{\"id\":10,\"name\":\"Tanvi Sachdeva\",\"phone\":\"84330678235\",\"countryCode\":\"+258\",\"country\":\"Mozambique\",\"state\":\"Not\"},{\"id\":11,\"name\":\"Florencio Samuel\",\"phone\":\"847602609\",\"countryCode\":\"+258\",\"country\":\"Mozambique\",\"state\":\"Valid\"},{\"id\":12,\"name\":\"Solo Dolo\",\"phone\":\"042423566\",\"countryCode\":\"+258\",\"country\":\"Mozambique\",\"state\":\"Not\"},{\"id\":13,\"name\":\"Pedro B 173\",\"phone\":\"823747618\",\"countryCode\":\"+258\",\"country\":\"Mozambique\",\"state\":\"Valid\"},{\"id\":14,\"name\":\"Ezequiel Fenias\",\"phone\":\"848826725\",\"countryCode\":\"+258\",\"country\":\"Mozambique\",\"state\":\"Valid\"},{\"id\":15,\"name\":\"JACKSON NELLY\",\"phone\":\"775069443\",\"countryCode\":\"+256\",\"country\":\"Uganda\",\"state\":\"Valid\"},{\"id\":16,\"name\":\"Kiwanuka Budallah\",\"phone\":\"7503O6263\",\"countryCode\":\"+256\",\"country\":\"Uganda\",\"state\":\"Not\"},{\"id\":17,\"name\":\"VINEET SETH\",\"phone\":\"704244430\",\"countryCode\":\"+256\",\"country\":\"Uganda\",\"state\":\"Valid\"},{\"id\":18,\"name\":\"Jokkene Richard\",\"phone\":\"7734127498\",\"countryCode\":\"+256\",\"country\":\"Uganda\",\"state\":\"Not\"},{\"id\":19,\"name\":\"Ogwal David\",\"phone\":\"7771031454\",\"countryCode\":\"+256\",\"country\":\"Uganda\",\"state\":\"Not\"},{\"id\":20,\"name\":\"pt shop 0901 Ultimo \",\"phone\":\"3142345678\",\"countryCode\":\"+256\",\"country\":\"Uganda\",\"state\":\"Not\"},{\"id\":21,\"name\":\"Daniel Makori\",\"phone\":\"714660221\",\"countryCode\":\"+256\",\"country\":\"Uganda\",\"state\":\"Valid\"},{\"id\":22,\"name\":\"shop23 sales\",\"phone\":\"9773199405\",\"countryCode\":\"+251\",\"country\":\"Ethiopia\",\"state\":\"Not\"},{\"id\":23,\"name\":\"Filimon Embaye\",\"phone\":\"914701723\",\"countryCode\":\"+251\",\"country\":\"Ethiopia\",\"state\":\"Valid\"},{\"id\":24,\"name\":\"ABRAHAM NEGASH\",\"phone\":\"911203317\",\"countryCode\":\"+251\",\"country\":\"Ethiopia\",\"state\":\"Valid\"},{\"id\":25,\"name\":\"ZEKARIAS KEBEDE\",\"phone\":\"9119454961\",\"countryCode\":\"+251\",\"country\":\"Ethiopia\",\"state\":\"Not\"},{\"id\":26,\"name\":\"EPHREM KINFE\",\"phone\":\"914148181\",\"countryCode\":\"+251\",\"country\":\"Ethiopia\",\"state\":\"Valid\"},{\"id\":27,\"name\":\"Karim Niki\",\"phone\":\"966002259\",\"countryCode\":\"+251\",\"country\":\"Ethiopia\",\"state\":\"Valid\"},{\"id\":28,\"name\":\"Frehiwot Teka\",\"phone\":\"988200000\",\"countryCode\":\"+251\",\"country\":\"Ethiopia\",\"state\":\"Valid\"},{\"id\":29,\"name\":\"Fanetahune Abaia\",\"phone\":\"924418461\",\"countryCode\":\"+251\",\"country\":\"Ethiopia\",\"state\":\"Valid\"},{\"id\":30,\"name\":\"Yonatan Tekelay\",\"phone\":\"911168450\",\"countryCode\":\"+251\",\"country\":\"Ethiopia\",\"state\":\"Valid\"},{\"id\":31,\"name\":\"EMILE CHRISTIAN KOUKOU DIKANDA HONORE \",\"phone\":\"697151594\",\"countryCode\":\"+237\",\"country\":\"Cameroon\",\"state\":\"Valid\"},{\"id\":32,\"name\":\"MICHAEL MICHAEL\",\"phone\":\"677046616\",\"countryCode\":\"+237\",\"country\":\"Cameroon\",\"state\":\"Valid\"},{\"id\":33,\"name\":\"ARREYMANYOR ROLAND TABOT\",\"phone\":\"6A0311634\",\"countryCode\":\"+237\",\"country\":\"Cameroon\",\"state\":\"Not\"},{\"id\":34,\"name\":\"LOUIS PARFAIT OMBES NTSO\",\"phone\":\"673122155\",\"countryCode\":\"+237\",\"country\":\"Cameroon\",\"state\":\"Valid\"},{\"id\":35,\"name\":\"JOSEPH FELICIEN NOMO\",\"phone\":\"695539786\",\"countryCode\":\"+237\",\"country\":\"Cameroon\",\"state\":\"Valid\"},{\"id\":36,\"name\":\"SUGAR STARRK BARRAGAN\",\"phone\":\"6780009592\",\"countryCode\":\"+237\",\"country\":\"Cameroon\",\"state\":\"Not\"},{\"id\":37,\"name\":\"WILLIAM KEMFANG\",\"phone\":\"6622284920\",\"countryCode\":\"+237\",\"country\":\"Cameroon\",\"state\":\"Not\"},{\"id\":38,\"name\":\"THOMAS WILFRIED LOMO LOMO\",\"phone\":\"696443597\",\"countryCode\":\"+237\",\"country\":\"Cameroon\",\"state\":\"Valid\"},{\"id\":39,\"name\":\"Dominique mekontchou\",\"phone\":\"691816558\",\"countryCode\":\"+237\",\"country\":\"Cameroon\",\"state\":\"Valid\"},{\"id\":40,\"name\":\"Nelson Nelson\",\"phone\":\"699209115\",\"countryCode\":\"+237\",\"country\":\"Cameroon\",\"state\":\"Valid\"}]";
		JSONAssert.assertEquals(expected, result.getResponse().getContentAsString(),false);
	}
}
