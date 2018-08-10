import javax.swing.JOptionPane;

public class TheDungeon {
	public static void main(String[] args) {
		String[] options = {"Keep Walking","Enter"};
		String[] Skeleton = {"Examine Further", "Take his stuff"};
		int answer = JOptionPane.showOptionDialog(null, "As you walk along a dirt path through a long frogotten forest \n you spot a molded over trap door", "The Beginning", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, "");
		
		System.out.println(answer);
		if (answer == 0) {
			System.exit(0);
		} else {
			JOptionPane.showMessageDialog(null, "You pull open the door, you can hear the joints to which it holds creak and bend");
		}
		JOptionPane.showMessageDialog(null, "As you enter into the damp, basment, \n you spot across the room a long spiriling stair case down.");
		JOptionPane.showMessageDialog(null, "As you lower yourself down the stairs, \n a feeling of discomfort comes over you");
		JOptionPane.showMessageDialog(null, "As you come to a landing, you find an empty room with a long dead skeleton sitting on the wall");
		int answer_2 = JOptionPane.showOptionDialog(null, "He has on him a small, rusted, brass sword, and a bottle containing a light red liquuid", "", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, Skeleton, "");
		System.out.println(answer_2);
		if(answer_2 == 0) {
			JOptionPane.showMessageDialog(null, "As you examine the body you notice a small note which reads \n 'Turn back now while you still can' the note is smeared in blood" );
		}
	}
}
