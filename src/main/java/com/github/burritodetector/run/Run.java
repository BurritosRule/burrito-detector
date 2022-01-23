package com.github.burritodetector.run;

import java.io.IOException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.github.burritodetector.menuparser.MenuParser;
import com.github.burritodetector.menus.TacoBellMenuParser;

public class Run {

	public static void main(String[] args) throws IOException {
		MenuParser tacoBellMenu = new TacoBellMenuParser();

		Logger logger = LoggerFactory.getLogger(Run.class);
		logger.info(tacoBellMenu.getMenuItems().toString());
	}

}
