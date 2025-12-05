package com.learncenter.design.pattern.builder;

import com.learncenter.design.pattern.builder.turtlebuilder.StubbornTurtleBuilder;
import com.learncenter.design.pattern.builder.turtlebuilder.TurleExpert;
import com.learncenter.design.pattern.factory.StubbornTurtleFactory;
import com.learncenter.design.pattern.turtles.Turtle;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class BuilderApplicationTests {

	TurleExpert turtleExpert=new TurleExpert();
	StubbornTurtleFactory stubbornTurtleFactory = new StubbornTurtleFactory();
	StubbornTurtleBuilder stubbornTurtleBuilder = new StubbornTurtleBuilder();
	Turtle expectedNormalTurtle = new Turtle(3,16,"carapace");


	@BeforeEach
	void cleanseBuilders(){
		stubbornTurtleBuilder.cleanTurtle();
	}

	@Test
	void shouldCreateTurtleViaFactorySequentially() {

	Turtle normalTurtleFromFactory = stubbornTurtleFactory.createNormalTurtle();

	assertEquals(normalTurtleFromFactory,expectedNormalTurtle);


	}

	@Test
	void shouldCreateTurtleViaBuilderSequentially() {

		turtleExpert.makeNormalTurtle(stubbornTurtleBuilder);
		Turtle normalTurtleFromBuilder= stubbornTurtleBuilder.getTurtle();

		assertEquals(normalTurtleFromBuilder,expectedNormalTurtle);

	}




}
