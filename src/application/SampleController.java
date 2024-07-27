package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class SampleController {

	@FXML
    private Label a00;

    @FXML
    private Label a01;

    @FXML
    private Label a02;

    @FXML
    private Label a03;

    @FXML
    private Label a04;

    @FXML
    private Label a10;

    @FXML
    private Label a11;

    @FXML
    private Label a12;

    @FXML
    private Label a13;

    @FXML
    private Label a14;

    @FXML
    private Label a20;

    @FXML
    private Label a21;

    @FXML
    private Label a22;

    @FXML
    private Label a23;

    @FXML
    private Label a24;

    @FXML
    private Label a30;

    @FXML
    private Label a31;

    @FXML
    private Label a32;

    @FXML
    private Label a33;

    @FXML
    private Label a34;

    @FXML
    private Label a40;

    @FXML
    private Label a41;

    @FXML
    private Label a42;

    @FXML
    private Label a43;

    @FXML
    private Label a44;

    @FXML
    private Label a50;

    @FXML
    private Label a51;

    @FXML
    private Label a52;

    @FXML
    private Label a53;

    @FXML
    private Label a54;

    @FXML
    private Pane background;

    @FXML
    private Button keya;

    @FXML
    private Button keyb;

    @FXML
    private Button keyc;

    @FXML
    private Button keyd;

    @FXML
    private Button keydel;

    @FXML
    private Button keye;

    @FXML
    private Button keyenter;

    @FXML
    private Button keyf;

    @FXML
    private Button keyg;

    @FXML
    private Button keyh;

    @FXML
    private Button keyi;

    @FXML
    private Button keyj;

    @FXML
    private Button keyk;

    @FXML
    private Button keyl;

    @FXML
    private Button keym;

    @FXML
    private Button keyn;

    @FXML
    private Button keyo;

    @FXML
    private Button keyp;

    @FXML
    private Button keyq;

    @FXML
    private Button keyr;

    @FXML
    private Button keys;

    @FXML
    private Button keyt;

    @FXML
    private Button keyu;

    @FXML
    private Button keyv;

    @FXML
    private Button keyw;

    @FXML
    private Button keyx;

    @FXML
    private Button keyy;

    @FXML
    private Button keyz;
    
    @FXML
    private TextField notificationText;
    
    @FXML
    private Button backgroundButton;
    
    @FXML
    private BorderPane window;
    
    @FXML
    private Button saveButton;
    
    @FXML
    private Button resumeButton;

    @FXML
    private Button startButton;
    
    @FXML
    private Button statsButton;
    
    @FXML
    private Pane statsBoard;
    
    @FXML
    private Label statsLabel;
    
    @FXML
    private Label winLabel;
    
    @FXML
    private Label lossLabel;
    
    @FXML
    private Label guessDistributionLabel;
    
    @FXML
    private Label gdOneLabel;
    
    @FXML
    private Label gdTwoLabel;
    
    @FXML
    private Label gdThreeLabel;
    
    @FXML
    private Label gdFourLabel;
    
    @FXML
    private Label gdFiveLabel;
    @FXML
    private Label gdSixLabel;
    
    @FXML
    private Button hideStatsButton;
    
    private int wins = 0;
    
    private int losses = 0;
    
    private int gdOne = 0;
    
    private int gdTwo = 0;
    
    private int gdThree = 0;
    
    private int gdFour = 0;
    
    private int gdFive = 0;
    
    private int gdSix = 0;
    

    
    Shadow answerGrid = new Shadow();
    
	BufferedWriter FW;
	String answer = "";
	ArrayList<String> allWords = new ArrayList<>();
    
    public void initialize() throws Exception{
		Scanner scanner = new Scanner(new File("C:\\Users\\Nick Truong\\eclipse-workspace\\Wordle\\src\\application\\words"));
		while (scanner.hasNext()) {
			allWords.add(scanner.next());
		}
		answer = allWords.get((int)( Math.random()*allWords.size()));
		scanner.close();
		System.out.println("The answer is " + answer);
		FW = new BufferedWriter(new FileWriter("log.txt"));
		FW.write(answer);
		FW.newLine();
    }
 
    
    @FXML
    public void start(ActionEvent event) throws Exception{
    	Stage primaryStage = new Stage();
    	Parent root = FXMLLoader.load(getClass().getResource("/application/Sample.fxml"));
		Scene scene = new Scene(root,800,1000);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.show();
		System.out.println("Start pressed");
		FW.write("Start pressed");
		FW.newLine();		
    }
    
    @FXML
    public void clear(ActionEvent event) {
    	System.out.println("Reset pressed");
    	try {
			FW.write("Reset pressed");
			FW.newLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	answerGrid.clear();
    	changeGridColors(0,0, "white");
    	changeGridColors(0,1, "white");
    	changeGridColors(0,2, "white");
    	changeGridColors(0,3, "white");
    	changeGridColors(0,4, "white");
    	changeGridColors(1,0, "white");
    	changeGridColors(1,1, "white");
    	changeGridColors(1,2, "white");
    	changeGridColors(1,3, "white");
    	changeGridColors(1,4, "white");
    	changeGridColors(2,0, "white");
    	changeGridColors(2,1, "white");
    	changeGridColors(2,2, "white");
    	changeGridColors(2,3, "white");
    	changeGridColors(2,4, "white");
    	changeGridColors(3,0, "white");
    	changeGridColors(3,1, "white");
    	changeGridColors(3,2, "white");
    	changeGridColors(3,3, "white");
    	changeGridColors(3,4, "white");
    	changeGridColors(4,0, "white");
    	changeGridColors(4,1, "white");
    	changeGridColors(4,2, "white");
    	changeGridColors(4,3, "white");
    	changeGridColors(4,4, "white");
    	changeGridColors(5,0, "white");
    	changeGridColors(5,1, "white");
    	changeGridColors(5,2, "white");
    	changeGridColors(5,3, "white");
    	changeGridColors(5,4, "white");
    	changeKeyColors("q", "white");
    	changeKeyColors("w", "white");
    	changeKeyColors("e", "white");
    	changeKeyColors("r", "white");
    	changeKeyColors("t", "white");
    	changeKeyColors("y", "white");
    	changeKeyColors("u", "white");
    	changeKeyColors("i", "white");
    	changeKeyColors("o", "white");
    	changeKeyColors("p", "white");
    	changeKeyColors("a", "white");
    	changeKeyColors("s", "white");
    	changeKeyColors("d", "white");
    	changeKeyColors("f", "white");
    	changeKeyColors("g", "white");
    	changeKeyColors("h", "white");
    	changeKeyColors("j", "white");
    	changeKeyColors("k", "white");
    	changeKeyColors("l", "white");
    	changeKeyColors("z", "white");
    	changeKeyColors("x", "white");
    	changeKeyColors("c", "white");
    	changeKeyColors("v", "white");
    	changeKeyColors("b", "white");
    	changeKeyColors("n", "white");
    	changeKeyColors("m", "white");
    	keyq.setDisable(false);
    	keyw.setDisable(false);
    	keye.setDisable(false);
    	keyr.setDisable(false);
    	keyt.setDisable(false);
    	keyy.setDisable(false);
    	keyu.setDisable(false);
    	keyi.setDisable(false);
    	keyo.setDisable(false);
    	keyp.setDisable(false);
    	keya.setDisable(false);
    	keys.setDisable(false);
    	keyd.setDisable(false);
    	keyf.setDisable(false);
    	keyg.setDisable(false);
    	keyh.setDisable(false);
    	keyj.setDisable(false);
    	keyk.setDisable(false);
    	keyl.setDisable(false);
    	keyz.setDisable(false);
    	keyx.setDisable(false);
    	keyc.setDisable(false);
    	keyv.setDisable(false);
    	keyb.setDisable(false);
    	keyn.setDisable(false);
    	keym.setDisable(false);
    	answer = allWords.get((int)( Math.random()*allWords.size()));
    	System.out.println("New Game");
    	System.out.println("The new word is " + answer);
    	
    	try {
			FW.write("New Game. The new word is " + answer);
			FW.newLine();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	display();
    }
    
    @FXML
    public void showStats(ActionEvent event) {
    	System.out.println("Clicked stats button");
    	statsBoard.setVisible(true);
    	statsButton.setVisible(false);
    	hideStatsButton.setVisible(true);
    }
    
    @FXML
    public void hideStats(ActionEvent event) {
    	System.out.println("Clicked hide stats button");
    	statsBoard.setVisible(false);
    	statsButton.setVisible(true);
    	hideStatsButton.setVisible(false);
    }
    
    @FXML
    public void clickKeyq(ActionEvent event) {
    	answerGrid.addLetter("q");
    	System.out.println("Clicked q");
    	try {
			FW.write("Clicked q");
			FW.newLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	display();
    }
    @FXML
	public void clickKeyw(ActionEvent event) {
    	answerGrid.addLetter("w");
    	System.out.println("Clicked w");
    	try {
			FW.write("Clicked w");
			FW.newLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	display();
	}
    @FXML
	public void clickKeye(ActionEvent event) {
    	answerGrid.addLetter("e");
    	System.out.println("Clicked e");
    	try {
			FW.write("Clicked e");
			FW.newLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	display();
	}
    @FXML
	public void clickKeyr(ActionEvent event) {
    	answerGrid.addLetter("r");
    	System.out.println("Clicked r");
    	try {
			FW.write("Clicked r");
			FW.newLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	display();
	}
    @FXML
	public void clickKeyt(ActionEvent event) {
    	answerGrid.addLetter("t");
    	System.out.println("Clicked t");
    	try {
			FW.write("Clicked t");
			FW.newLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	display();
	}
    @FXML
	public void clickKeyy(ActionEvent event) {
    	answerGrid.addLetter("y");
    	System.out.println("Clicked y");
    	try {
			FW.write("Clicked y");
			FW.newLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	display();
	}
    @FXML
	public void clickKeyu(ActionEvent event) {
    	answerGrid.addLetter("u");
    	System.out.println("Clicked u");
    	try {
			FW.write("Clicked u");
			FW.newLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	display();
	}
    @FXML
	public void clickKeyi(ActionEvent event) {
    	answerGrid.addLetter("i");
    	System.out.println("Clicked i");
    	try {
			FW.write("Clicked i");
			FW.newLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	display();
	}
    @FXML
	public void clickKeyo(ActionEvent event) {
    	answerGrid.addLetter("o");
    	System.out.println("Clicked o");
    	try {
			FW.write("Clicked o");
			FW.newLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	display();
	}
    @FXML
	public void clickKeyp(ActionEvent event) {
    	answerGrid.addLetter("p");
    	System.out.println("Clicked p");
    	try {
			FW.write("Clicked p");
			FW.newLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	display();
	}
    @FXML
	public void clickKeya(ActionEvent event) {
    	answerGrid.addLetter("a");
    	System.out.println("Clicked a");
    	try {
			FW.write("Clicked a");
			FW.newLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	display();
	}
    @FXML
	public void clickKeys(ActionEvent event) {
    	answerGrid.addLetter("s");
    	System.out.println("Clicked s");
    	try {
			FW.write("Clicked s");
			FW.newLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	display();
	}
    @FXML
	public void clickKeyd(ActionEvent event) {
    	answerGrid.addLetter("d");
    	System.out.println("Clicked d");
    	try {
			FW.write("Clicked d");
			FW.newLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	display();
	}
    @FXML
	public void clickKeyf(ActionEvent event) {
    	answerGrid.addLetter("f");
    	System.out.println("Clicked f");
    	try {
			FW.write("Clicked f");
			FW.newLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	display();
	}
    @FXML
	public void clickKeyg(ActionEvent event) {
    	answerGrid.addLetter("g");
    	System.out.println("Clicked g");
    	try {
			FW.write("Clicked g");
			FW.newLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	display();
	}
    @FXML
	public void clickKeyh(ActionEvent event) {
    	answerGrid.addLetter("h");
    	System.out.println("Clicked h");
    	try {
			FW.write("Clicked h");
			FW.newLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	display();
	}
    @FXML
	public void clickKeyj(ActionEvent event) {
    	answerGrid.addLetter("j");
    	System.out.println("Clicked j");
    	try {
			FW.write("Clicked j");
			FW.newLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	display();
	}
    @FXML
	public void clickKeyk(ActionEvent event) {
    	answerGrid.addLetter("k");
    	System.out.println("Clicked k");
    	try {
			FW.write("Clicked k");
			FW.newLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	display();
	}
    @FXML
	public void clickKeyl(ActionEvent event) {
    	answerGrid.addLetter("l");
    	System.out.println("Clicked l");
    	try {
			FW.write("Clicked l");
			FW.newLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	display();
	}
    @FXML
	public void clickKeyz(ActionEvent event) {
    	answerGrid.addLetter("z");
    	System.out.println("Clicked z");
    	try {
			FW.write("Clicked z");
			FW.newLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	display();
	}
    @FXML
	public void clickKeyx(ActionEvent event) {
    	answerGrid.addLetter("x");
    	System.out.println("Clicked x");
    	try {
			FW.write("Clicked x");
			FW.newLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	display();
	}
    @FXML
	public void clickKeyc(ActionEvent event) {
    	answerGrid.addLetter("c");
    	System.out.println("Clicked c");
    	try {
			FW.write("Clicked c");
			FW.newLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	display();
	}
    @FXML
	public void clickKeyv(ActionEvent event) {
    	answerGrid.addLetter("v");
    	System.out.println("Clicked v");
    	try {
			FW.write("Clicked v");
			FW.newLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	display();
	}
    @FXML
	public void clickKeyb(ActionEvent event) {
    	answerGrid.addLetter("b");
    	System.out.println("Clicked b");
    	try {
			FW.write("Clicked b");
			FW.newLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	display();
	}
    @FXML
	public void clickKeyn(ActionEvent event) {
    	answerGrid.addLetter("n");
    	System.out.println("Clicked n");
    	try {
			FW.write("Clicked n");
			FW.newLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	display();
	}
    @FXML
	public void clickKeym(ActionEvent event) {
    	answerGrid.addLetter("m");
    	System.out.println("Clicked m");
    	try {
			FW.write("Clicked m");
			FW.newLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	display();
	}
    @FXML
    public void hideNotif(ActionEvent event) {
    	notificationText.setVisible(false);
    }
    
    @FXML
	public void clickKeyenter(ActionEvent event) throws IOException {
    	if (answerGrid.getY() == 5) {
			String testWord = answerGrid.at(answerGrid.getX(), 0) + answerGrid.at(answerGrid.getX(), 1) + answerGrid.at(answerGrid.getX(), 2) + answerGrid.at(answerGrid.getX(), 3) + answerGrid.at(answerGrid.getX(), 4);
			if (!allWords.contains(testWord)) {
				System.out.println("Not a valid word");
				try {
					FW.write("User entered not a valid word");
					FW.newLine();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				notificationText.setVisible(true);
				notificationText.setText("Not a valid word try again");
				return;
			}
			else {
				try {
					FW.write("User entered " + testWord);
					FW.newLine();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				for (int i = 0; i < 5; i++) {
					if (testWord.substring(i,i+1).equals(answer.substring(i,i+1))) {
						changeGridColors(answerGrid.getX(), i, "green");
						changeKeyColors(testWord.substring(i,i+1), "green");
					}
					else if(answer.contains(testWord.substring(i,i+1))) {
						changeGridColors(answerGrid.getX(), i, "yellow");
						changeKeyColors(testWord.substring(i,i+1), "yellow");
					}
					else {
						changeGridColors(answerGrid.getX(), i, "grey");
						disableKey(testWord.substring(i,i+1));
					}
				}
				if (testWord.equals(answer)) {
					wins++;
					winLabel.setText("Wins: " + wins);
				
					if(answerGrid.getX() == 0) {
						gdOne += 1;
						gdOneLabel.setText("1: " + gdOne);
					}
					else if(answerGrid.getX() == 1) {
						gdTwo += 1;
						gdTwoLabel.setText("2: " + gdTwo);
					}
					else if(answerGrid.getX() == 2) {
						gdThree += 1;
						gdThreeLabel.setText("3: " + gdThree);
					}
					else if(answerGrid.getX() == 3) {
						gdFour += 1;
						gdFourLabel.setText("4: " + gdFour);
					}
					else if(answerGrid.getX() == 4) {
						gdFive += 1;
						gdFiveLabel.setText("5: " + gdFive);
					}
					else if(answerGrid.getX() == 5) {
						gdSix += 1;
						gdSixLabel.setText("6: " + gdSix);
					}
					
					
					System.out.println("NICE JOB");
					notificationText.setVisible(true);
					notificationText.setText("NICE JOBBBB UR GOATED");
					try {
						FW.write("USER WON WWWWOOOOOP");
						FW.newLine();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					statsBoard.setVisible(true);
					statsButton.setVisible(false);
					hideStatsButton.setVisible(true);
					//disabling keys
					answerGrid.setX(6);
					answerGrid.setY(5);
					
				}
				if(answerGrid.getX() == 5 && answerGrid.getY() == 5) {
					notificationText.setVisible(true);
					notificationText.setText("Sadly you lost :( Press Reset to play again.");
					System.out.println("Sadly you lost :(");
					FW.write("Sadly you lost :(");
					FW.newLine();
					losses += 1;
					lossLabel.setText("Losses: " + losses);
					statsBoard.setVisible(true);
					statsButton.setVisible(false);
					hideStatsButton.setVisible(true);
					return;
				}
				answerGrid.setY(0);
				answerGrid.setX(answerGrid.getX() + 1);
				return;
			}
		}
    	System.out.println("Not 5 letters yet");
    	notificationText.setVisible(true);
		notificationText.setText("Not 5 letters yet dummy");
    	try {
			FW.write("User entered a word that is not 5 letters");
			FW.newLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
    @FXML
	public void clickKeydel(ActionEvent event) {
		answerGrid.delLetter();
		System.out.println("Clicked del");
    	try {
			FW.write("Clicked del");
			FW.newLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		display();
	}
    
    @FXML
    public void display() {
    	a00.setText(answerGrid.at(0, 0));
    	a01.setText(answerGrid.at(0, 1));
    	a02.setText(answerGrid.at(0, 2));
    	a03.setText(answerGrid.at(0, 3));
    	a04.setText(answerGrid.at(0, 4));
    	a10.setText(answerGrid.at(1, 0));
    	a11.setText(answerGrid.at(1, 1));
    	a12.setText(answerGrid.at(1, 2));
    	a13.setText(answerGrid.at(1, 3));
    	a14.setText(answerGrid.at(1, 4));
    	a20.setText(answerGrid.at(2, 0));
    	a21.setText(answerGrid.at(2, 1));
    	a22.setText(answerGrid.at(2, 2));
    	a23.setText(answerGrid.at(2, 3));
    	a24.setText(answerGrid.at(2, 4));
    	a30.setText(answerGrid.at(3, 0));
    	a31.setText(answerGrid.at(3, 1));
    	a32.setText(answerGrid.at(3, 2));
    	a33.setText(answerGrid.at(3, 3));
    	a34.setText(answerGrid.at(3, 4));
    	a40.setText(answerGrid.at(4, 0));
    	a41.setText(answerGrid.at(4, 1));
    	a42.setText(answerGrid.at(4, 2));
    	a43.setText(answerGrid.at(4, 3));
    	a44.setText(answerGrid.at(4, 4));
    	a50.setText(answerGrid.at(5, 0));
    	a51.setText(answerGrid.at(5, 1));
    	a52.setText(answerGrid.at(5, 2));
    	a53.setText(answerGrid.at(5, 3));
    	a54.setText(answerGrid.at(5, 4));
    	
    }
    
    @FXML
    public void hideGame(ActionEvent event){
//    	window.setDisable(true);
    	window.setVisible(false);
    	System.out.println("Save and exit preseed");
    	try {
			FW.write("Save and exit preseed");
			FW.newLine();
			FW.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	resumeButton.setVisible(true);
//    	resumeButton.setDisable(false);
    	startButton.setVisible(false);
    }
    
    @FXML
    public void resumeGame(ActionEvent event) {
    	System.out.println("Resume pressed");
    	try {
			FW.write("Resume pressed");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	resumeButton.setVisible(false);
    	resumeButton.setDisable(true);
    	startButton.setVisible(true);
    	window.setDisable(false);
    }
    
    public void disableKey(String s) {
    	if (s.equals("a")){
    		keya.setDisable(true);
    		changeKeyColors("a", "grey");
    	}
    	else if (s.equals("b")){
    		keyb.setDisable(true);
    		changeKeyColors("b", "grey");
    	}
    	else if (s.equals("c")){
    		keyc.setDisable(true);
    		changeKeyColors("c", "grey");
    	}
    	else if (s.equals("d")){
    		keyd.setDisable(true);
    		changeKeyColors("d", "grey");
    	}
    	else if (s.equals("e")){
    		keye.setDisable(true);
    		changeKeyColors("e", "grey");
    	}
    	else if (s.equals("f")){
    		keyf.setDisable(true);
    		changeKeyColors("f", "grey");
    	}
    	else if (s.equals("g")){
    		keyg.setDisable(true);
    		changeKeyColors("g", "grey");
    	}
    	else if (s.equals("h")){
    		keyh.setDisable(true);
    		changeKeyColors("h", "grey");
    	}
    	else if (s.equals("i")){
    		keyi.setDisable(true);
    		changeKeyColors("i", "grey");
    	}
    	else if (s.equals("j")){
    		keyj.setDisable(true);
    		changeKeyColors("j", "grey");
    	}
    	else if (s.equals("k")){
    		keyk.setDisable(true);
    		changeKeyColors("k", "grey");
    	}
    	else if (s.equals("l")){
    		keyl.setDisable(true);
    		changeKeyColors("l", "grey");
    	}
    	else if (s.equals("m")){
    		keym.setDisable(true);
    		changeKeyColors("m", "grey");
    	}
    	else if (s.equals("n")){
    		keyn.setDisable(true);
    		changeKeyColors("n", "grey");
    	}
    	else if (s.equals("o")){
    		keyo.setDisable(true);
    		changeKeyColors("o", "grey");
    	}
    	else if (s.equals("p")){
    		keyp.setDisable(true);
    		changeKeyColors("p", "grey");
    	}
    	else if (s.equals("q")){
    		keyq.setDisable(true);
    		changeKeyColors("q", "grey");
    	}
    	else if (s.equals("r")){
    		keyr.setDisable(true);
    		changeKeyColors("r", "grey");
    	}
    	else if (s.equals("s")){
    		keys.setDisable(true);
    		changeKeyColors("s", "grey");
    	}
    	else if (s.equals("t")){
    		keyt.setDisable(true);
    		changeKeyColors("t", "grey");
    	}
    	else if (s.equals("u")){
    		keyu.setDisable(true);
    		changeKeyColors("u", "grey");
    	}
    	else if (s.equals("v")){
    		keyv.setDisable(true);
    		changeKeyColors("v", "grey");
    	}
    	else if (s.equals("w")){
    		keyw.setDisable(true);
    		changeKeyColors("w", "grey");
    	}
    	else if (s.equals("x")){
    		keyx.setDisable(true);
    		changeKeyColors("x", "grey");
    	}
    	else if (s.equals("y")){
    		keyy.setDisable(true);
    		changeKeyColors("y", "grey");
    	}
    	else if (s.equals("z")){
    		keyz.setDisable(true);
    		changeKeyColors("z", "grey");
    	}
    }
    
    public void changeKeyColors(String s, String color) {
    	if (s.equals("a")) {
    		keya.setStyle("-fx-background-color: " + color + "; -fx-background-radius: 10px; -fx-border-image-width: 2px; -fx-border-color: black; -fx-border-radius: 10px; -fx-font-size: 30px; -fx-text-fill: black;");;
    	}
    	else if (s.equals("b")) {
    		keyb.setStyle("-fx-background-color: " + color + "; -fx-background-radius: 10px; -fx-border-image-width: 2px; -fx-border-color: black; -fx-border-radius: 10px; -fx-font-size: 30px; -fx-text-fill: black;");;
    	}
    	else if (s.equals("c")) {
    		keyc.setStyle("-fx-background-color: " + color + "; -fx-background-radius: 10px; -fx-border-image-width: 2px; -fx-border-color: black; -fx-border-radius: 10px; -fx-font-size: 30px; -fx-text-fill: black;");;
    	}
    	else if (s.equals("d")) {
    		keyd.setStyle("-fx-background-color: " + color + "; -fx-background-radius: 10px; -fx-border-image-width: 2px; -fx-border-color: black; -fx-border-radius: 10px; -fx-font-size: 30px; -fx-text-fill: black;");;
    	}
    	else if (s.equals("e")) {
    		keye.setStyle("-fx-background-color: " + color + "; -fx-background-radius: 10px; -fx-border-image-width: 2px; -fx-border-color: black; -fx-border-radius: 10px; -fx-font-size: 30px; -fx-text-fill: black;");;
    	}
    	else if (s.equals("f")) {
    		keyf.setStyle("-fx-background-color: " + color + "; -fx-background-radius: 10px; -fx-border-image-width: 2px; -fx-border-color: black; -fx-border-radius: 10px; -fx-font-size: 30px; -fx-text-fill: black;");;
    	}
    	else if (s.equals("g")) {
    		keyg.setStyle("-fx-background-color: " + color + "; -fx-background-radius: 10px; -fx-border-image-width: 2px; -fx-border-color: black; -fx-border-radius: 10px; -fx-font-size: 30px; -fx-text-fill: black;");;
    	}
    	else if (s.equals("h")) {
    		keyh.setStyle("-fx-background-color: " + color + "; -fx-background-radius: 10px; -fx-border-image-width: 2px; -fx-border-color: black; -fx-border-radius: 10px; -fx-font-size: 30px; -fx-text-fill: black;");;
    	}
    	else if (s.equals("i")) {
    		keyi.setStyle("-fx-background-color: " + color + "; -fx-background-radius: 10px; -fx-border-image-width: 2px; -fx-border-color: black; -fx-border-radius: 10px; -fx-font-size: 30px; -fx-text-fill: black;");;
    	}
    	else if (s.equals("j")) {
    		keyj.setStyle("-fx-background-color: " + color + "; -fx-background-radius: 10px; -fx-border-image-width: 2px; -fx-border-color: black; -fx-border-radius: 10px; -fx-font-size: 30px; -fx-text-fill: black;");;
    	}
    	else if (s.equals("k")) {
    		keyk.setStyle("-fx-background-color: " + color + "; -fx-background-radius: 10px; -fx-border-image-width: 2px; -fx-border-color: black; -fx-border-radius: 10px; -fx-font-size: 30px; -fx-text-fill: black;");;
    	}
    	else if (s.equals("l")) {
    		keyl.setStyle("-fx-background-color: " + color + "; -fx-background-radius: 10px; -fx-border-image-width: 2px; -fx-border-color: black; -fx-border-radius: 10px; -fx-font-size: 30px; -fx-text-fill: black;");;
    	}
    	else if (s.equals("m")) {
    		keym.setStyle("-fx-background-color: " + color + "; -fx-background-radius: 10px; -fx-border-image-width: 2px; -fx-border-color: black; -fx-border-radius: 10px; -fx-font-size: 30px; -fx-text-fill: black;");;
    	}
    	else if (s.equals("n")) {
    		keyn.setStyle("-fx-background-color: " + color + "; -fx-background-radius: 10px; -fx-border-image-width: 2px; -fx-border-color: black; -fx-border-radius: 10px; -fx-font-size: 30px; -fx-text-fill: black;");;
    	}
    	else if (s.equals("o")) {
    		keyo.setStyle("-fx-background-color: " + color + "; -fx-background-radius: 10px; -fx-border-image-width: 2px; -fx-border-color: black; -fx-border-radius: 10px; -fx-font-size: 30px; -fx-text-fill: black;");;
    	}
    	else if (s.equals("p")) {
    		keyp.setStyle("-fx-background-color: " + color + "; -fx-background-radius: 10px; -fx-border-image-width: 2px; -fx-border-color: black; -fx-border-radius: 10px; -fx-font-size: 30px; -fx-text-fill: black;");;
    	}
    	else if (s.equals("q")) {
    		keyq.setStyle("-fx-background-color: " + color + "; -fx-background-radius: 10px; -fx-border-image-width: 2px; -fx-border-color: black; -fx-border-radius: 10px; -fx-font-size: 30px; -fx-text-fill: black;");;
    	}
    	else if (s.equals("r")) {
    		keyr.setStyle("-fx-background-color: " + color + "; -fx-background-radius: 10px; -fx-border-image-width: 2px; -fx-border-color: black; -fx-border-radius: 10px; -fx-font-size: 30px; -fx-text-fill: black;");;
    	}
    	else if (s.equals("s")) {
    		keys.setStyle("-fx-background-color: " + color + "; -fx-background-radius: 10px; -fx-border-image-width: 2px; -fx-border-color: black; -fx-border-radius: 10px; -fx-font-size: 30px; -fx-text-fill: black;");;
    	}
    	else if (s.equals("t")) {
    		keyt.setStyle("-fx-background-color: " + color + "; -fx-background-radius: 10px; -fx-border-image-width: 2px; -fx-border-color: black; -fx-border-radius: 10px; -fx-font-size: 30px; -fx-text-fill: black;");;
    	}
    	else if (s.equals("u")) {
    		keyu.setStyle("-fx-background-color: " + color + "; -fx-background-radius: 10px; -fx-border-image-width: 2px; -fx-border-color: black; -fx-border-radius: 10px; -fx-font-size: 30px; -fx-text-fill: black;");;
    	}
    	else if (s.equals("v")) {
    		keyv.setStyle("-fx-background-color: " + color + "; -fx-background-radius: 10px; -fx-border-image-width: 2px; -fx-border-color: black; -fx-border-radius: 10px; -fx-font-size: 30px; -fx-text-fill: black;");;
    	}
    	else if (s.equals("w")) {
    		keyw.setStyle("-fx-background-color: " + color + "; -fx-background-radius: 10px; -fx-border-image-width: 2px; -fx-border-color: black; -fx-border-radius: 10px; -fx-font-size: 30px; -fx-text-fill: black;");;
    	}
    	else if (s.equals("x")) {
    		keyx.setStyle("-fx-background-color: " + color + "; -fx-background-radius: 10px; -fx-border-image-width: 2px; -fx-border-color: black; -fx-border-radius: 10px; -fx-font-size: 30px; -fx-text-fill: black;");;
    	}
    	else if (s.equals("y")) {
    		keyy.setStyle("-fx-background-color: " + color + "; -fx-background-radius: 10px; -fx-border-image-width: 2px; -fx-border-color: black; -fx-border-radius: 10px; -fx-font-size: 30px; -fx-text-fill: black;");;
    	}
    	else if (s.equals("z")) {
    		keyz.setStyle("-fx-background-color: " + color + "; -fx-background-radius: 10px; -fx-border-image-width: 2px; -fx-border-color: black; -fx-border-radius: 10px; -fx-font-size: 30px; -fx-text-fill: black;");;
    	}
    	
    }
    
//    @FXML
    public void changeGridColors(int x, int y, String color) {
    	if (x == 0 && y == 0) {
    		a00.setStyle("-fx-background-color: " + color + "; -fx-background-radius: 10px; -fx-border-width: 2px; -fx-border-color: black; -fx-border-radius: 10px; -fx-font-size: 50px;");
    	}
    	else if (x == 0 && y == 1) {
    		a01.setStyle("-fx-background-color: " + color + "; -fx-background-radius: 10px; -fx-border-width: 2px; -fx-border-color: black; -fx-border-radius: 10px; -fx-font-size: 50px;");
    	}
    	else if (x == 0 && y == 2) {
    		a02.setStyle("-fx-background-color: " + color + "; -fx-background-radius: 10px; -fx-border-width: 2px; -fx-border-color: black; -fx-border-radius: 10px; -fx-font-size: 50px;");
    	}
    	else if (x == 0 && y == 3) {
    		a03.setStyle("-fx-background-color: " + color + "; -fx-background-radius: 10px; -fx-border-width: 2px; -fx-border-color: black; -fx-border-radius: 10px; -fx-font-size: 50px;");
    	}
    	else if (x == 0 && y == 4) {
    		a04.setStyle("-fx-background-color: " + color + "; -fx-background-radius: 10px; -fx-border-width: 2px; -fx-border-color: black; -fx-border-radius: 10px; -fx-font-size: 50px;");
    	}
    	else if (x == 1 && y == 0) {
    		a10.setStyle("-fx-background-color: " + color + "; -fx-background-radius: 10px; -fx-border-width: 2px; -fx-border-color: black; -fx-border-radius: 10px; -fx-font-size: 50px;");
    	}
    	else if (x == 1 && y == 1) {
    		a11.setStyle("-fx-background-color: " + color + "; -fx-background-radius: 10px; -fx-border-width: 2px; -fx-border-color: black; -fx-border-radius: 10px; -fx-font-size: 50px;");
    	}
    	else if (x == 1 && y == 2) {
    		a12.setStyle("-fx-background-color: " + color + "; -fx-background-radius: 10px; -fx-border-width: 2px; -fx-border-color: black; -fx-border-radius: 10px; -fx-font-size: 50px;");
    	}
    	else if (x == 1 && y == 3) {
    		a13.setStyle("-fx-background-color: " + color + "; -fx-background-radius: 10px; -fx-border-width: 2px; -fx-border-color: black; -fx-border-radius: 10px; -fx-font-size: 50px;");
    	}
    	else if (x == 1 && y == 4) {
    		a14.setStyle("-fx-background-color: " + color + "; -fx-background-radius: 10px; -fx-border-width: 2px; -fx-border-color: black; -fx-border-radius: 10px; -fx-font-size: 50px;");
    	}
    	else if (x == 2 && y == 0) {
    		a20.setStyle("-fx-background-color: " + color + "; -fx-background-radius: 10px; -fx-border-width: 2px; -fx-border-color: black; -fx-border-radius: 10px; -fx-font-size: 50px;");
    	}
    	else if (x == 2 && y == 1) {
    		a21.setStyle("-fx-background-color: " + color + "; -fx-background-radius: 10px; -fx-border-width: 2px; -fx-border-color: black; -fx-border-radius: 10px; -fx-font-size: 50px;");
    	}
    	else if (x == 2 && y == 2) {
    		a22.setStyle("-fx-background-color: " + color + "; -fx-background-radius: 10px; -fx-border-width: 2px; -fx-border-color: black; -fx-border-radius: 10px; -fx-font-size: 50px;");
    	}
    	else if (x == 2 && y == 3) {
    		a23.setStyle("-fx-background-color: " + color + "; -fx-background-radius: 10px; -fx-border-width: 2px; -fx-border-color: black; -fx-border-radius: 10px; -fx-font-size: 50px;");
    	}
    	else if (x == 2 && y == 4) {
    		a24.setStyle("-fx-background-color: " + color + "; -fx-background-radius: 10px; -fx-border-width: 2px; -fx-border-color: black; -fx-border-radius: 10px; -fx-font-size: 50px;");
    	}
    	else if (x == 3 && y == 0) {
    		a30.setStyle("-fx-background-color: " + color + "; -fx-background-radius: 10px; -fx-border-width: 2px; -fx-border-color: black; -fx-border-radius: 10px; -fx-font-size: 50px;");
    	}
    	else if (x == 3 && y == 1) {
    		a31.setStyle("-fx-background-color: " + color + "; -fx-background-radius: 10px; -fx-border-width: 2px; -fx-border-color: black; -fx-border-radius: 10px; -fx-font-size: 50px;");
    	}
    	else if (x == 3 && y == 2) {
    		a32.setStyle("-fx-background-color: " + color + "; -fx-background-radius: 10px; -fx-border-width: 2px; -fx-border-color: black; -fx-border-radius: 10px; -fx-font-size: 50px;");
    	}
    	else if (x == 3 && y == 3) {
    		a33.setStyle("-fx-background-color: " + color + "; -fx-background-radius: 10px; -fx-border-width: 2px; -fx-border-color: black; -fx-border-radius: 10px; -fx-font-size: 50px;");
    	}
    	else if (x == 3 && y == 4) {
    		a34.setStyle("-fx-background-color: " + color + "; -fx-background-radius: 10px; -fx-border-width: 2px; -fx-border-color: black; -fx-border-radius: 10px; -fx-font-size: 50px;");
    	}
    	else if (x == 4 && y == 0) {
    		a40.setStyle("-fx-background-color: " + color + "; -fx-background-radius: 10px; -fx-border-width: 2px; -fx-border-color: black; -fx-border-radius: 10px; -fx-font-size: 50px;");
    	}
    	else if (x == 4 && y == 1) {
    		a41.setStyle("-fx-background-color: " + color + "; -fx-background-radius: 10px; -fx-border-width: 2px; -fx-border-color: black; -fx-border-radius: 10px; -fx-font-size: 50px;");
    	}
    	else if (x == 4 && y == 2) {
    		a42.setStyle("-fx-background-color: " + color + "; -fx-background-radius: 10px; -fx-border-width: 2px; -fx-border-color: black; -fx-border-radius: 10px; -fx-font-size: 50px;");
    	}
    	else if (x == 4 && y == 3) {
    		a43.setStyle("-fx-background-color: " + color + "; -fx-background-radius: 10px; -fx-border-width: 2px; -fx-border-color: black; -fx-border-radius: 10px; -fx-font-size: 50px;");
    	}
    	else if (x == 4 && y == 4) {
    		a44.setStyle("-fx-background-color: " + color + "; -fx-background-radius: 10px; -fx-border-width: 2px; -fx-border-color: black; -fx-border-radius: 10px; -fx-font-size: 50px;");
    	}
    	else if (x == 5 && y == 0) {
    		a50.setStyle("-fx-background-color: " + color + "; -fx-background-radius: 10px; -fx-border-width: 2px; -fx-border-color: black; -fx-border-radius: 10px; -fx-font-size: 50px;");
    	}
    	else if (x == 5 && y == 1) {
    		a51.setStyle("-fx-background-color: " + color + "; -fx-background-radius: 10px; -fx-border-width: 2px; -fx-border-color: black; -fx-border-radius: 10px; -fx-font-size: 50px;");
    	}
    	else if (x == 5 && y == 2) {
    		a52.setStyle("-fx-background-color: " + color + "; -fx-background-radius: 10px; -fx-border-width: 2px; -fx-border-color: black; -fx-border-radius: 10px; -fx-font-size: 50px;");
    	}
    	else if (x == 5 && y == 3) {
    		a53.setStyle("-fx-background-color: " + color + "; -fx-background-radius: 10px; -fx-border-width: 2px; -fx-border-color: black; -fx-border-radius: 10px; -fx-font-size: 50px;");
    	}
    	else if (x == 5 && y == 4) {
    		a54.setStyle("-fx-background-color: " + color + "; -fx-background-radius: 10px; -fx-border-width: 2px; -fx-border-color: black; -fx-border-radius: 10px; -fx-font-size: 50px;");
    	}
    	
    }
	



}
