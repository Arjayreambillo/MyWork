import com.googlecode.lanterna.terminal.*;
import com.googlecode.lanterna.terminal.ansi.*;

public class LineDrawing03
{
	public static void main(String[] args) throws java.io.IOException {
		Terminal terminal = new DefaultTerminalFactory().createTerminal();
		int num;
		int length = 1;
		terminal.enterPrivateMode();
		for(int i=1;i<=20;i=i+2){
			num=(length/2)+(length%2);
			for(int j=1;j<=length;j=j+1){
				terminal.setCursorPosition(j,i);
				if(j <= num){
					terminal.putCharacter('X');
				}
				else{
				terminal.putCharacter('Y');
				}
			}
			length++;
		}
		terminal.flush();
		terminal.readInput();
		terminal.exitPrivateMode();
	}
}
