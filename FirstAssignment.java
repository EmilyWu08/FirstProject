/**
 *	FirstAssignment.java
 *	Display a brief description of your summer vacation on the screen.
 *
 *	To compile Linux:	javac -cp .:mvAcm.jar FirstAssignment.java
 *	To execute Linux:	java -cp .:mvAcm.jar FirstAssignment
 *
 *	To compile MS Powershell:	javac -cp ".;mvAcm.jar" FirstAssignment.java
 *	To execute MS Powershell:	java -cp ".;mvAcm.jar" FirstAssignment
 *
 *	@author	Emily Wu
 *	@since	8/23/2024
 */
import java.awt.Font;

import acm.program.GraphicsProgram;
import acm.graphics.GLabel;

public class FirstAssignment extends GraphicsProgram {
    
    public void run() {
    	//	The font to be used
    	Font f = new Font("Serif", Font.BOLD, 25);
    	
    	//	Line 1
    	GLabel s1 = new GLabel("What I did on my summer vacation ...", 10, 20);
    	s1.setFont(f);
    	add(s1);
    	    	
    	//	Continue adding lines until you have 12 to 15 lines
    	GLabel s2 = new GLabel("In the first few weeks, I relaxed at home and chill, spending my spare time by playing the piano and drawing. In July, I participated", 10, 50);
		s2.setFont(f);
    	add(s2);

        GLabel s3 = new GLabel("in an online summer program associated with programming. Through the 5 weeks of program I gained experience of HTML, CSS,", 10, 80);
    	s3.setFont(f);
		add(s3);

		GLabel s4 = new GLabel("and javascript, which walked me through a bunch of interesting web development projects. At the same time, I also started self ", 10, 110);
    	s4.setFont(f);
    	add(s4);


		GLabel s5 = new GLabel("studying AP CSP in order to take the exam next year. After the busy July, I went to seattle with my family. We didn't take a plane, ", 10, 140);
    	s5.setFont(f);
    	add(s5);

		GLabel s6 = new GLabel("instead we drove all the way there from here, which is a very tedious trip taking about 13 hours. On the way we stopped in oregon ", 10, 170);
    	s6.setFont(f);
    	add(s6);

		GLabel s7 = new GLabel("for two nights and visited two national parks. They aren't that breathtakingly beautiful, like those famous ones in other states, ", 10, 200);
    	s7.setFont(f);
    	add(s7);

		GLabel s8 = new GLabel("but they're still nice places to embrace the nature and breathe fresh air. The only bad part was that we ran out of food half way", 10, 230);
    	s8.setFont(f);
    	add(s8);

		GLabel s9 = new GLabel("in those mountains and had to stay hungry until midnight when we finally found a town with a Mcdonald's open. Finally in seattle, ", 10, 260);
    	s9.setFont(f);
    	add(s9);

		GLabel s10 = new GLabel("we went on a city tour including all famous tourist spots such as the tower and the flea market. My favorites are the science museum", 10, 290);
    	s10.setFont(f);
    	add(s10);

		GLabel s11 = new GLabel(" and the ocean view from the tower, especially at sunset. The whole gradient of colors from orange to pink to blue, the comparison of", 10, 320);
    	s11.setFont(f);
    	add(s11);

		GLabel s12 = new GLabel("tall buildings on one side and the pure broad sea on the other, altogether forms a stunningly beautiful view from up there. Science", 10, 350);
    	s12.setFont(f);
    	add(s12);

		GLabel s13 = new GLabel("museum was unexpectedly fun, filled with interesting experimental facilities for people all age round to try on. My younger brother", 10, 380);
    	s13.setFont(f);
    	add(s13);

		GLabel s14 = new GLabel("didn't want to leave at the end of day. On the last day, we visited University of Washinton (although it's not my dream school) and", 10, 410);
    	s14.setFont(f);
    	add(s14);

		GLabel s15 = new GLabel("started the way home on another route along the coast. It tooks a few hours longer, but we could see the ocean all way long, so I'd", 10, 440);
    	s15.setFont(f);
    	add(s15);
		
		GLabel s16 = new GLabel("say it's worth it. For the rest of summer I self studied a bunch of classes,did some volunteer,and soon school starts, back here again:(", 10, 470);
    	s16.setFont(f);
    	add(s16);
    }
    
}