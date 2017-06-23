package view;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TestGameView.class, TestGameFrame.class, TestInfoPanel.class, TestMainMenu.class, TestMainWindow.class,
		TestMenuImage.class, TestOptionsPanel.class, TestTile.class, TestWinLoseView.class })
public class AllTests {

}
