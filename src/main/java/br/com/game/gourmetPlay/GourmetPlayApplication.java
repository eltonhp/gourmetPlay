package br.com.game.gourmetPlay;

import br.com.game.gourmetPlay.view.panel.qualityDishComponent.QualityDishPanel;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;



@SpringBootApplication
public class GourmetPlayApplication {


	public static void main(String[] args) {
		SpringApplicationBuilder builder = new SpringApplicationBuilder(GourmetPlayApplication.class);
		builder.headless(false);
		builder.run(args);
}

}
