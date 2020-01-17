import com.googlecode.lanterna.terminal.*;
import com.googlecode.lanterna.terminal.ansi.*;

public class MidtermAct05{
	public static void main(String[] args) throws java.io.IOException {
		Terminal terminal = new DefaultTerminalFactory().createTerminal();
		terminal.enterPrivateMode();
		for(int i = 1;i <= 2;++i){
			terminal.setCursorPosition(1, i);
			for(int j =1;j <= 10;++j){
				terminal.putCharacter('X');
			}
		}
		terminal.flush();
		terminal.readInput();
		terminal.exitPrivateMode();
	}	
}
