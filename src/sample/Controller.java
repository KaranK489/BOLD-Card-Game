//import stuff
package sample;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import java.util.ArrayList;
import java.util.Arrays;
//controller class
public class Controller {
    //cards array list which stores the current cards that are left in the deck.
    public ArrayList<Card> cards = new ArrayList<>();
    //cards clicked array list which stores the current cards clicked.
    public ArrayList<Card> cardsClicked = new ArrayList<>();
    //2 dimensional board array that stores the current cards from the cards array that are on the board.
    public Card[][] board = new Card[4][5];
    //2 dimensional image view array to display all the images in the gridpane.
    public ImageView[][] boardImageView = new ImageView[4][5];
    //1 - Dots, Lines, Stars; 2 - Bottle, Glass, Jug; 3 - Blue, Orange, Yellow; 4 - Small, Medium, Big.
    //creates all new images for all 84 cards and the image of the backside of the card.
    Image back = new Image("resources/Back.jpg");
    Image DBBB = new Image("resources/DBBB.jpg");
    Image DBBM = new Image("resources/DBBM.jpg");
    Image DBBS = new Image("resources/DBBS.jpg");
    Image DBOB = new Image("resources/DBOB.jpg");
    Image DBOM = new Image("resources/DBOM.jpg");
    Image DBOS = new Image("resources/DBOS.jpg");
    Image DBYB = new Image("resources/DBYB.jpg");
    Image DBYM = new Image("resources/DBYM.jpg");
    Image DBYS = new Image("resources/DBYS.jpg");
    Image DCBB = new Image("resources/DCBB.jpg");
    Image DCBM = new Image("resources/DCBM.jpg");
    Image DCBS = new Image("resources/DCBS.jpg");
    Image DCOB = new Image("resources/DCOB.jpg");
    Image DCOM = new Image("resources/DCOM.jpg");
    Image DCOS = new Image("resources/DCOS.jpg");
    Image DCYB = new Image("resources/DCYB.jpg");
    Image DCYM = new Image("resources/DCYM.jpg");
    Image DCYS = new Image("resources/DCYS.jpg");
    Image DJBB = new Image("resources/DJBB.jpg");
    Image DJBM = new Image("resources/DJBM.jpg");
    Image DJBS = new Image("resources/DJBS.jpg");
    Image DJOB = new Image("resources/DJOB.jpg");
    Image DJOM = new Image("resources/DJOM.jpg");
    Image DJOS = new Image("resources/DJOS.jpg");
    Image DJYB = new Image("resources/DJYB.jpg");
    Image DJYM = new Image("resources/DJYM.jpg");
    Image DJYS = new Image("resources/DJYS.jpg");
    Image LBBB = new Image("resources/LBBB.jpg");
    Image LBBM = new Image("resources/LBBM.jpg");
    Image LBBS = new Image("resources/LBBS.jpg");
    Image LBOB = new Image("resources/LBOB.jpg");
    Image LBOM = new Image("resources/LBOM.jpg");
    Image LBOS = new Image("resources/LBOS.jpg");
    Image LBYB = new Image("resources/LBYB.jpg");
    Image LBYM = new Image("resources/LBYM.jpg");
    Image LBYS = new Image("resources/LBYS.jpg");
    Image LCBB = new Image("resources/LCBB.jpg");
    Image LCBM = new Image("resources/LCBM.jpg");
    Image LCBS = new Image("resources/LCBS.jpg");
    Image LCOB = new Image("resources/LCOB.jpg");
    Image LCOM = new Image("resources/LCOM.jpg");
    Image LCOS = new Image("resources/LCOS.jpg");
    Image LCYB = new Image("resources/LCYB.jpg");
    Image LCYM = new Image("resources/LCYM.jpg");
    Image LCYS = new Image("resources/LCYS.jpg");
    Image LJBB = new Image("resources/LJBB.jpg");
    Image LJBM = new Image("resources/LJBM.jpg");
    Image LJBS = new Image("resources/LJBS.jpg");
    Image LJOB = new Image("resources/LJOB.jpg");
    Image LJOM = new Image("resources/LJOM.jpg");
    Image LJOS = new Image("resources/LJOS.jpg");
    Image LJYB = new Image("resources/LJYB.jpg");
    Image LJYM = new Image("resources/LJYM.jpg");
    Image LJYS = new Image("resources/LJYS.jpg");
    Image SBBB = new Image("resources/SBBB.jpg");
    Image SBBM = new Image("resources/SBBM.jpg");
    Image SBBS = new Image("resources/SBBS.jpg");
    Image SBOB = new Image("resources/SBOB.jpg");
    Image SBOM = new Image("resources/SBOM.jpg");
    Image SBOS = new Image("resources/SBOS.jpg");
    Image SBYB = new Image("resources/SBYB.jpg");
    Image SBYM = new Image("resources/SBYM.jpg");
    Image SBYS = new Image("resources/SBYS.jpg");
    Image SCBB = new Image("resources/SCBB.jpg");
    Image SCBM = new Image("resources/SCBM.jpg");
    Image SCBS = new Image("resources/SCBS.jpg");
    Image SCOB = new Image("resources/SCOB.jpg");
    Image SCOM = new Image("resources/SCOM.jpg");
    Image SCOS = new Image("resources/SCOS.jpg");
    Image SCYB = new Image("resources/SCYB.jpg");
    Image SCYM = new Image("resources/SCYM.jpg");
    Image SCYS = new Image("resources/SCYS.jpg");
    Image SJBB = new Image("resources/SJBB.jpg");
    Image SJBM = new Image("resources/SJBM.jpg");
    Image SJBS = new Image("resources/SJBS.jpg");
    Image SJOB = new Image("resources/SJOB.jpg");
    Image SJOM = new Image("resources/SJOM.jpg");
    Image SJOS = new Image("resources/SJOS.jpg");
    Image SJYB = new Image("resources/SJYB.jpg");
    Image SJYM = new Image("resources/SJYM.jpg");
    Image SJYS = new Image("resources/SJYS.jpg");
    Image SKIP = new Image("resources/SKIP.jpg");
    Image WILD = new Image("resources/WILD.jpg");
    Image PNTS = new Image("resources/POINTS.jpg");
    //labels, buttons, a gridpane, and a listview, all used in the program.
    @FXML
    Label lblDisplayTurn, lblDisplayP1Pts, lblDisplayError, lblDisplayNoEndMatch, lblDisplayStatus, lblDisplayCardsLeft, lblDisplayP2Pts, lblDisplayPoints, lblDisplayP3Pts, lblDisplayP4Pts, lblDisplayMatches1, lblDisplayMatches2, lblDisplayMatches3, lblDisplayMatches4, lblDisplayPlayerAmt;
    @FXML
    Button btnStart, btnReplaceCards, btnRedeemPts, btnRestart;
    @FXML
    GridPane gdpPlayGrid;
    @FXML
    ListView<Integer> txtPlayers;
    //letterMatch arraylist of strings to store the matching letters each time it checks for matches.
    ArrayList<String> letterMatch = new ArrayList<>();
    //arraylist of integer arrays to store the spots of the cards clicked.
    ArrayList<int[]> cardsClickedSpots = new ArrayList<>();
    //integers for every player's points, the cardNum, and player amount, all equal to 0.
    int p1Pts, p2Pts, p3Pts, p4Pts, cardNum, players = 0;
    //integer for turn, defaulted to 2.
    int turn = 2;
    //row index and column index integers.
    int rowIndex, colIndex;
    //flip cards boolean set to true.
    boolean flipCards = true;
    //booleans to see if the wild card, double points card, or skip card are clicked, and these are defaulted to false.
    boolean wildClicked, pntsClicked, skipClicked = false;
    //initialize method.
    public void initialize() {
        //disables replace cards, redeem points, and start button.
        btnReplaceCards.setDisable(true);
        btnRedeemPts.setDisable(true);
        btnStart.setDisable(true);
        //clears letter match and points labels that may have been there from before.
        clearLetterMatch();
        clearPoints();
        //clears the players array list, and adds options for 2-4 players.
        txtPlayers.getItems().clear();
        txtPlayers.getItems().add(2);
        txtPlayers.getItems().add(3);
        txtPlayers.getItems().add(4);
        //clears cards left, player amount, points, and turn labels.
        lblDisplayCardsLeft.setText("");
        lblDisplayPlayerAmt.setText("");
        lblDisplayPoints.setText("");
        lblDisplayTurn.setText("");
        //makes the restart button invisible.
        btnRestart.setVisible(false);
    }
    //start method.
    @FXML
    private void start() {
        //disables start button.
        btnStart.setDisable(true);
        //methods that display possible points, and the turn.
        displayPtsPossible();
        displayTurn();
        //disables player selection listview.
        txtPlayers.setDisable(true);
        //add points method.
        addPts();
        //clears cards, cardsClicked, cardsClickedSpots, and letterMatch arraylists.
        cards.clear();
        cardsClicked.clear();
        cardsClickedSpots.clear();
        letterMatch.clear();
        //method that sets the deck.
        setDeck();
        //method that deals cards on the board.
        dealBoard();
        //loop that runs for every spot of the board image view, so 20 times.
        for (int i = 0; i < boardImageView.length; i++) {
            for (int j = 0; j < boardImageView[0].length; j++) {
                //initializes each of the indexes in the ImageView array with empty ImageView
                boardImageView[i][j] = new ImageView();
                //sets each ImageView in the array to a the picture of the back of the card.
                boardImageView[i][j].setImage(back);
                //makes each image view a 100x100 square.
                boardImageView[i][j].setFitHeight(100);
                boardImageView[i][j].setFitWidth(100);
                //adds each of the ImageViews to the GridPane in their respective spots, passing parameters of the object, column, and row.
                gdpPlayGrid.add(boardImageView[i][j], j, i);
            }
        }
        //this is the mouse event method to sense when the player clicks on something.
        EventHandler z = new EventHandler<MouseEvent>() {
            @Override
            //handle method.
            public void handle(MouseEvent t) {
                //gets the row index of which image you clicked on.
                rowIndex = GridPane.getRowIndex(((ImageView) t.getSource()));
                //gets the column index of which image you clicked on.
                colIndex = GridPane.getColumnIndex(((ImageView) t.getSource()));
                //if the flip cards boolean is true (basically if there was not a no match situation),
                if (flipCards) {
                    //runs the checkMatch function passing through the row and column indices.
                    checkMatch(rowIndex, colIndex);
                }
                //displays the amount of cards left.
                displayCards();
            }
        };
        //loop that runs for each spot in the grid pane (20 times).
        for (int i = 0; i < boardImageView.length; i++) {
            for (int j = 0; j < boardImageView[0].length; j++) {
                //setting the onMouseClicked property for each of the ImageViews to call z (the event handler)
                boardImageView[i][j].setOnMouseClicked(z);
            }
        }
        //displays the amount of cards left.
        displayCards();
    }
    //method that sets the deck of cards.
    public void setDeck() {
        //adds all the 84 cards to the cards array list.
//        cards.add(new Card("DBBB", DBBB));
        cards.add(new Card("DBBM", DBBM));
//        cards.add(new Card("DBBS", DBBS));
//        cards.add(new Card("DBOB", DBOB));
//        cards.add(new Card("DBOM", DBOM));
//        cards.add(new Card("DBOS", DBOS));
//        cards.add(new Card("DBYB", DBYB));
//        cards.add(new Card("DBYM", DBYM));
//        cards.add(new Card("DBYS", DBYS));
//        cards.add(new Card("DCBB", DCBB));
//        cards.add(new Card("DCBM", DCBM));
//        cards.add(new Card("DCBS", DCBS));
//        cards.add(new Card("DCOB", DCOB));
//        cards.add(new Card("DCOM", DCOM));
//        cards.add(new Card("DCOS", DCOS));
//        cards.add(new Card("DCYB", DCYB));
//        cards.add(new Card("DCYM", DCYM));
//        cards.add(new Card("DCYS", DCYS));
//        cards.add(new Card("DJBB", DJBB));
//        cards.add(new Card("DJBM", DJBM));
//        cards.add(new Card("DJBS", DJBS));
        cards.add(new Card("DJOB", DJOB));
        cards.add(new Card("DJOM", DJOM));
        cards.add(new Card("DJOS", DJOS));
        cards.add(new Card("DJYB", DJYB));
        cards.add(new Card("DJYM", DJYM));
        cards.add(new Card("DJYS", DJYS));
//        cards.add(new Card("LBBB", LBBB));
//        cards.add(new Card("LBBM", LBBM));
//        cards.add(new Card("LBBS", LBBS));
//        cards.add(new Card("LBOB", LBOB));
//        cards.add(new Card("LBOM", LBOM));
//        cards.add(new Card("LBOS", LBOS));
//        cards.add(new Card("LBYB", LBYB));
        cards.add(new Card("LBYM", LBYM));
//        cards.add(new Card("LBYS", LBYS));
//        cards.add(new Card("LCBB", LCBB));
//        cards.add(new Card("LCBM", LCBM));
//        cards.add(new Card("LCBS", LCBS));
//        cards.add(new Card("LCOB", LCOB));
//        cards.add(new Card("LCOM", LCOM));
//        cards.add(new Card("LCOS", LCOS));
//        cards.add(new Card("LCYB", LCYB));
        cards.add(new Card("LCYM", LCYM));
        cards.add(new Card("LCYS", LCYS));
        cards.add(new Card("LJBB", LJBB));
        cards.add(new Card("LJBM", LJBM));
        cards.add(new Card("LJBS", LJBS));
//        cards.add(new Card("LJOB", LJOB));
//        cards.add(new Card("LJOM", LJOM));
//        cards.add(new Card("LJOS", LJOS));
//        cards.add(new Card("LJYB", LJYB));
//        cards.add(new Card("LJYM", LJYM));
        cards.add(new Card("LJYS", LJYS));
//        cards.add(new Card("SBBB", SBBB));
//        cards.add(new Card("SBBM", SBBM));
//        cards.add(new Card("SBBS", SBBS));
//        cards.add(new Card("SBOB", SBOB));
//        cards.add(new Card("SBOM", SBOM));
//        cards.add(new Card("SBOS", SBOS));
//        cards.add(new Card("SBYB", SBYB));
        cards.add(new Card("SBYM", SBYM));
//        cards.add(new Card("SBYS", SBYS));
//        cards.add(new Card("SCBB", SCBB));
//        cards.add(new Card("SCBM", SCBM));
//        cards.add(new Card("SCBS", SCBS));
        cards.add(new Card("SCOB", SCOB));
        cards.add(new Card("SCOM", SCOM));
        cards.add(new Card("SCOS", SCOS));
//        cards.add(new Card("SCYB", SCYB));
//        cards.add(new Card("SCYM", SCYM));
//        cards.add(new Card("SCYS", SCYS));
//        cards.add(new Card("SJBB", SJBB));
//        cards.add(new Card("SJBM", SJBM));
//        cards.add(new Card("SJBS", SJBS));
//        cards.add(new Card("SJOB", SJOB));
        cards.add(new Card("SJOM", SJOM));
        cards.add(new Card("SJOS", SJOS));
        cards.add(new Card("SJYB", SJYB));
//        cards.add(new Card("SJYM", SJYM));
//        cards.add(new Card("SJYS", SJYS));
        cards.add(new Card("SKIP", SKIP));
        cards.add(new Card("WILD", WILD));
        cards.add(new Card("PNTS", PNTS));
    }
    //method that deals the board.
    public void dealBoard() {
        //loop that runs for all the imageviews in the gridpane (20 times).
        for (int i = 0; i < boardImageView.length; i++) {
            for (int j = 0; j < boardImageView[0].length; j++) {
                //num is a random number created every time, a number from 0 to the size of the cards array list - 1, in order to randomize the cards that are placed on the board.
                int num = (int) (Math.random() * (cards.size()));
                //sets the spot in the board 2d array to the num position in the cards array list.
                board[i][j] = cards.get(num);
                //removes that card from the cards array list so it cannot be used again.
                cards.remove(num);
            }
        }
    }
    //method that checks for matches, passing through parameters r and c, for row and column indices respectively.
    public void checkMatch(int r, int c) {
        //sets the board image view spot cooresponding to the row and column parameters to the image in the board 2d array of cards (essentially flips over the card).
        boardImageView[r][c].setImage(board[r][c].getShowImage());
        //sets temp card to the board card in the cooresponding spot.
        Card temp = board[r][c];
        //sets runCode boolean to true, used later on.
        boolean runCode = true;
        //runs a loop for all the cards in the cardsClickedSpots arraylist.
        for (int i = 0; i < cardsClickedSpots.size(); i++) {
            //if any of the cards previously clicked equals the current spot clicked, it is a double click.
            if ((cardsClickedSpots.get(i)[0] == r) && (cardsClickedSpots.get(i)[1] == c)) {
                //this sets runCode to false, since the spot has been clicked more than once.
                runCode = false;
                //displays that the card has already been clicked, and to try again.
                lblDisplayError.setText("You already clicked this card. Try again.");
            }
        }
        //runs a getCardAmt method which checks how many image views are equal to null. if there is only 1 card on the board,
        if (getCardAmt() == 1) {
            //sets runCode to false.
            runCode = false;
            //displays that there is only one card left and that the player can restart the game.
            lblDisplayNoEndMatch.setText("There is only one card left. You can restart the game if you would like.");
            //runs an endGame method.
            endGame();
        }
        //if runCode is true,
        if (runCode) {
            //this if statement is basically looking at the attributes of the card, and if the card is not a WILD, double points, or skip turn card,
            if ((!(temp.getOneAttribute(0).equals("W") && temp.getOneAttribute(1).equals("I") && temp.getOneAttribute(2).equals("L") && temp.getOneAttribute(3).equals("D"))) && (!(temp.getOneAttribute(0).equals("P") && temp.getOneAttribute(1).equals("N") && temp.getOneAttribute(2).equals("T") && temp.getOneAttribute(3).equals("S"))) && (!(temp.getOneAttribute(0).equals("S") && temp.getOneAttribute(1).equals("K") && temp.getOneAttribute(2).equals("I") && temp.getOneAttribute(3).equals("P")))) {
                //it adds the card to the cardsClicked arraylist.
                cardsClicked.add(temp);
            //else, if the card is a WILD, double points, or skip turn card,
            } else {
                //if the card is a WILD card,
                if (temp.getOneAttribute(0).equals("W") && temp.getOneAttribute(1).equals("I") && temp.getOneAttribute(2).equals("L") && temp.getOneAttribute(3).equals("D")) {
                    //set the wildClicked boolean to true.
                    wildClicked = true;
                    //displays that the player found a WILD card, and that it will match with anything.
                    lblDisplayNoEndMatch.setText("You found a WILD card! This will match with anything.");
                }
                //if the card is a double points card,
                if (temp.getOneAttribute(0).equals("P") && temp.getOneAttribute(1).equals("N") && temp.getOneAttribute(2).equals("T") && temp.getOneAttribute(3).equals("S")) {
                    //set the pntsClicked boolean to true.
                    pntsClicked = true;
                    //displays that the player found a double points card, and that it will act as a wild card and give you double the points you would normally recieve..
                    lblDisplayNoEndMatch.setText("You found a double points card! This acts as a WILD card, but you will get double the points possible.");
                }
                //if the card is a skip turn card,
                if (temp.getOneAttribute(0).equals("S") && temp.getOneAttribute(1).equals("K") && temp.getOneAttribute(2).equals("I") && temp.getOneAttribute(3).equals("P")) {
                    //set the skipClicked boolean to true.
                    skipClicked = true;
                    //displays that the player found a skip turn card, and that it will act as a wild card and skip the next player's turn.
                    lblDisplayNoEndMatch.setText("You found a skip turn card! This acts as a WILD card, but will also skip the next player's turn.");
                }
            }
            //clears the error label.
            lblDisplayError.setText("");
            //initializes a tempSpot integer array of a length of 2.
            int[] tempSpot = new int[2];
            //sets the first spot in the array to the row index.
            tempSpot[0] = r;
            //sets the first spot in the array to the column index.
            tempSpot[1] = c;
            //adds tempSpot to the cardsClickedSpots arraylist.
            cardsClickedSpots.add(tempSpot);
            //adds 1 to cardNum.
            cardNum++;
            //runs a method to display the possible points.
            displayPtsPossible();
            //checks to make sure more than 2 cards have been clicked in order to test for a match.
            if (cardsClicked.size() > 1) {
                //clears letter match array in preparation for new matching attributes.
                letterMatch.clear();
                //loop that runs 4 times, for every attribute of each card.
                for (int i = 0; i < 4; i++) {
                    //sets letterJustAdded boolean to false, which will be used later.
                    boolean letterJustAdded = false;
                    //second loop which runs through all the attributes of each card in the cards clicked array, corresponding to the "i" attribute.
                    for (int j = 0; j < cardsClicked.size() - 1; j++) {
                        //if the any two attributes do not match at any point,
                        if ((!(cardsClicked.get(j).getOneAttribute(i).equals(cardsClicked.get(j + 1).getOneAttribute(i))))) {
                            //if a letter was just added to the letterMatch array for that attribute (letterJustAdded boolean), and there are letters in the letterMatch arraylist,
                            if (letterJustAdded && letterMatch.size() > 0) {
                                //this removes the last letter added to the letterMatch array, since there are no matches for that attribute, so that letter shouldn't be there.
                                letterMatch.remove(letterMatch.size() - 1);
                            }
                            //this sets j to the cardsClicked.size() - 1 in order to end this iteration of the loop, to move onto the next characteristic.
                            j = cardsClicked.size() - 1;
                            //else, if there is a match, and if a letter was not just added to the array,
                        } else if (cardsClicked.get(j).getOneAttribute(i).equals(cardsClicked.get(j + 1).getOneAttribute(i)) && !letterJustAdded) {
                            //adds the matching letter to the letterMatch array, including "i", which represents the attribute that letter is matching for.
                            letterMatch.add(i + cardsClicked.get(j).getOneAttribute(i));
                            //sets letterJustAdded to true, since a letter was just added.
                            letterJustAdded = true;
                        }
                    }
                    //displays the points possible.
                    displayPtsPossible();
                }
                //if the letter match array list is empty,
                if (letterMatch.isEmpty()) {
                    //the status label displays that the player didn't match, and needs to click the replace cards button.
                    lblDisplayStatus.setText("You didn't match, click replace cards to reset.");
                    //disables the redeem points button.
                    btnRedeemPts.setDisable(true);
                    //enables the replace cards button.
                    btnReplaceCards.setDisable(false);
                    //displays the points possible.
                    displayPtsPossible();
                    //sets cardNum to 0.
                    cardNum = 0;
                    //sets flipCards to false, so that the player cannot click more cards.
                    flipCards = false;
                //else,
                } else {
                    //display that the player found a match, and that they can redeem their points or continue trying to match.
                    lblDisplayStatus.setText("You found a match. Redeem your points, or keep going on.");
                    //enables the redeem points button.
                    btnRedeemPts.setDisable(false);
                }
            }
            //if there is 1 card clicked and a wild card clicked, or if there is 1 card clicked and a double points card clicked, or if there is 1 card clicked and a skip turn card clicked, or if there are no cards clicked and a wild card and double points card clicked, or if there are no cards clicked and a wild card and a skip turn card clicked, or if there are no cards clicked and a double points and skip turn card clicked,
            if ((cardsClicked.size() == 1 && wildClicked) || (cardsClicked.size() == 1 && pntsClicked) || (cardsClicked.size() == 1 && skipClicked) || (cardsClicked.size() == 0 && wildClicked && pntsClicked) || (cardsClicked.size() == 0 && wildClicked && skipClicked) || (cardsClicked.size() == 0 && pntsClicked && skipClicked)) {
                //display that the player found a match, and that they can redeem their points or continue trying to match.
                lblDisplayStatus.setText("You found a match. Redeem your points, or keep going on.");
                //enables the redeem points button.
                btnRedeemPts.setDisable(false);
            }
            //runs a letterMatch method which displays exactly what attributes are matching between the cards clicked.
            letterMatch();
        }
    }
    //matchFail method, which runs when the player clicks the replace cards button.
    public void matchFail() {
        //sets wildClicked, pntsClicked, and skipClicked to false.
        wildClicked = false;
        pntsClicked = false;
        skipClicked = false;
        //clears the noEndMatch label.
        lblDisplayNoEndMatch.setText("");
        //runs a loop for all the cards in the cardsClickedSpots arraylist.
        for (int i = 0; i < cardsClickedSpots.size(); i++) {
            //sets all the corresponding image views to the back image (flips the cards back over).
            boardImageView[cardsClickedSpots.get(i)[0]][cardsClickedSpots.get(i)[1]].setImage(back);
        }
        //changes the turn and displays the turn.
        displayTurn();
        //clears the cardsClicked array list.
        cardsClicked.clear();
        //clears the cardsClickedSpots array list.
        cardsClickedSpots.clear();
        //displays the amount of cards left.
        displayCards();
        //sets CardNum to 0.
        cardNum = 0;
        //clears the letterMatch arraylist.
        letterMatch.clear();
        //disables the replace cards button.
        btnReplaceCards.setDisable(true);
        //sets flipCards to true, so that matches can be made again.
        flipCards = true;
        //runs a clearLetterMatch method, which clears the labels displaying the matching attributes.
        clearLetterMatch();
        //clears the status label.
        lblDisplayStatus.setText("");
        //displays the points possible.
        displayPtsPossible();
        //runs a getCardAmt method which sees what spots on the board are empty. If there are less than 3 cards on the board,
        if (getCardAmt() < 3) {
            //displays that there was no match and that the player can restart the game.
            lblDisplayNoEndMatch.setText("These cards do not match. You can restart the game if you would like.");
            //runs an endGame method.
            endGame();
        }
    }
    //matchWin method, which runs when the person clicks on the redeem points button.
    public void matchWin() {
        //runs an addPts method which adds and displays points.
        addPts();
        //runs a method which changes and displays the turn.
        displayTurn();
        //sets wildClicked, pntsClicked, and skipClicked to false.
        wildClicked = false;
        pntsClicked = false;
        skipClicked = false;
        //clears the noEndMatch label.
        lblDisplayNoEndMatch.setText("");
        //if there are still cards in the cards deck,
        if (cards.size() > 0) {
            //runs a loop for all the values in the cardsClickedSpots array.
            for (int i = 0; i < cardsClickedSpots.size(); i++) {
                //if there are still cards in the cards deck,
                if (cards.size() > 0) {
                    //sets num to a random number between 0 and the size of the cards arraylist - 1;
                    int num = (int) (Math.random() * (cards.size()));
                    //sets the corresponding spot in the board 2d array to the card at the num position in the cards array list.
                    board[cardsClickedSpots.get(i)[0]][cardsClickedSpots.get(i)[1]] = cards.get(num);
                    //sets the board image view spot to the back image (flips the card back over, except it is now a new card).
                    boardImageView[cardsClickedSpots.get(i)[0]][cardsClickedSpots.get(i)[1]].setImage(back);
                    //removes the card in num position of the cards array list.
                    cards.remove(num);
                //else,
                } else {
                    //sets the board image view spot to null.
                    boardImageView[cardsClickedSpots.get(i)[0]][cardsClickedSpots.get(i)[1]].setImage(null);
                }
            }
        //else,
        } else {
            //runs a loop for the amount of cards in the cardsClickedSpots array.
            for (int i = 0; i < cardsClickedSpots.size(); i++) {
                //sets the board image view spot to null.
                boardImageView[cardsClickedSpots.get(i)[0]][cardsClickedSpots.get(i)[1]].setImage(null);
            }
        }
        //clears the cardsClicked, cardsClickedSpots, and letterMatch arraylists.
        cardsClicked.clear();
        cardsClickedSpots.clear();
        letterMatch.clear();
        //displays the amount of cards left.
        displayCards();
        //sets cardNum to 0.
        cardNum = 0;
        //displays the possible points.
        displayPtsPossible();
        //disables the redeem points button.
        btnRedeemPts.setDisable(true);
        //sets test integer to 0.
        int test = 0;
        //runs a double loop, a total of 20 times, for all the imageviews.
        //runs a loop 4 times.
        for (int i = 0; i < 4; i++) {
            //runs a loop 5 times.
            for (int j = 0; j < 5; j++) {
                //if the corresponding image view in boardImageView is equal to null,
                if ((boardImageView[i][j].getImage() == null)) {
                    //adds 1 to test.
                    test++;
                }
            }
        }
        //if test is equal to 20 (if all the image views are equal to null, or empty),
        if (test == 20) {
            //runs the endGame method.
            endGame();
        }
        //clears letter match labels that may have been there from before.
        clearLetterMatch();
        //clears the status label.
        lblDisplayStatus.setText("");
    }
    //displayTurn method which changes the turn and displays it.
    public void displayTurn() {
        //mathematical method that changes the turn according to how many players there are.
        turn = (turn % players) + 1;
        //if the skip turn card has been clicked,
        if (skipClicked) {
            //this repeats the mathematical function, skipping the next player's turn.
            turn = (turn % players) + 1;
        }
        //displays who's turn it is.
        lblDisplayTurn.setText("It is player " + turn + "'s turn");
    }
    //method that displays the possible points.
    public void displayPtsPossible() {
        //displays the possible points, which is the number of cards clicked times itself, or squared.
        lblDisplayPoints.setText("Points possible: " + (cardNum * cardNum));
        //if the double points card has been clicked,
        if (pntsClicked) {
            //displays the possible points, which is the number of cards clicked times itself, or squared, times 2, due to the double points card.
            lblDisplayPoints.setText("Points possible: " + (cardNum * cardNum * 2));
        }
    }
    //addPts method which adds and displays each player's points.
    public void addPts() {
        //multiplier integer defaulted to 1.
        int multiplier = 1;
        //if the double points card is clicked,
        if (pntsClicked) {
            //sets multiplier to 2.
            multiplier = 2;
        }
        //if it is player 1's turn,
        if (turn == 1) {
            //add the corresponding amount of points times the multiplier to player 1's points.
            p1Pts += (cardNum * cardNum * multiplier);
        //else if it is player 2's turn,
        } else if (turn == 2) {
            //add the corresponding amount of points times the multiplier to player 2's points.
            p2Pts += (cardNum * cardNum * multiplier);
        //else if it is player 3's turn,
        } else if (turn == 3) {
            //add the corresponding amount of points times the multiplier to player 3's points.
            p3Pts += (cardNum * cardNum * multiplier);
        //else if it is player 4's turn,
        } else {
            //add the corresponding amount of points times the multiplier to player 4's points.
            p4Pts += (cardNum * cardNum * multiplier);
        }
        //displays player 1's points.
        lblDisplayP1Pts.setText("Player 1 Points: " + p1Pts);
        //displays player 2's points.
        lblDisplayP2Pts.setText("Player 2 Points: " + p2Pts);
        //if there are more than 2 players,
        if (players > 2) {
            //displays player 3's points.
            lblDisplayP3Pts.setText("Player 3 Points: " + p3Pts);
        }
        //if there are more than 3 players,
        if (players > 3) {
            //displays player 4's points.
            lblDisplayP4Pts.setText("Player 4 Points: " + p4Pts);
        }
    }
    //method that displays the amount of cards left.
    public void displayCards() {
        //displays the amount of cards left.
        lblDisplayCardsLeft.setText("Cards Left: " + cards.size());
    }
    //method to edit the amount of players.
    public void editPlayers() {
        //sets players to the selected number in the listview.
        players = txtPlayers.getSelectionModel().getSelectedItem();
        //displays the current amount of players.
        lblDisplayPlayerAmt.setText("There are " + players + " players.");
        //sets the turn to the amount of players.
        turn = players;
        //enables the start button.
        btnStart.setDisable(false);
    }
    //method to find out exactly which attributes are matching.
    public void letterMatch() {
        //0 - Dots, Lines, Stars; 1 - Bottle, Glass, Jug; 2 - Blue, Orange, Yellow; 3 - Small, Medium, Big.
        //clears letter match labels that may have been there from before.
        clearLetterMatch();
        //loop that runs for all the amount of attributes that match in the letterMatch arraylist.
        for (int i = 0; i < letterMatch.size(); i++) {
            //if the first character in the i spot in letterMatch is 0 (if the attribute corresponds to dots, lines, or stars),
            if (letterMatch.get(i).charAt(0) == '0') {
                //if the second character in the i spot in letterMatch is D (if the attributes matching are dots),
                if (letterMatch.get(i).charAt(1) == 'D') {
                    //display that all the cards have dots.
                    lblDisplayMatches1.setText("All the cards have dots.");
                }
                //if the second character in the i spot in letterMatch is L (if the attributes matching are lines),
                if (letterMatch.get(i).charAt(1) == 'L') {
                    //display that all the cards have lines.
                    lblDisplayMatches1.setText("All the cards have lines.");
                }
                //if the second character in the i spot in letterMatch is S (if the attributes matching are stars),
                if (letterMatch.get(i).charAt(1) == 'S') {
                    //display that all the cards have stars.
                    lblDisplayMatches1.setText("All the cards have stars.");
                }
            }
            //if the first character in the i spot in letterMatch is 0 (if the attribute corresponds to a bottle, glass, or jug),
            if (letterMatch.get(i).charAt(0) == '1') {
                //if the second character in the i spot in letterMatch is B (if the attributes matching are bottles),
                if (letterMatch.get(i).charAt(1) == 'B') {
                    //display that all the cards have bottles.
                    lblDisplayMatches2.setText("All the cards have bottles");
                }
                //if the second character in the i spot in letterMatch is C (if the attributes matching are glasses),
                if (letterMatch.get(i).charAt(1) == 'C') {
                    //display that all the cards have glasses.
                    lblDisplayMatches2.setText("All the cards have glasses.");
                }
                //if the second character in the i spot in letterMatch is J (if the attributes matching are jugs),
                if (letterMatch.get(i).charAt(1) == 'J') {
                    //display that all the cards have jugs.
                    lblDisplayMatches2.setText("All the cards have jugs.");
                }
            }
            //if the first character in the i spot in letterMatch is 0 (if the attribute corresponds to blue, orange, or yellow),
            if (letterMatch.get(i).charAt(0) == '2') {
                //if the second character in the i spot in letterMatch is B (if the attributes matching are blue),
                if (letterMatch.get(i).charAt(1) == 'B') {
                    //display that all the cards are blue.
                    lblDisplayMatches3.setText("All the cards are blue.");
                }
                //if the second character in the i spot in letterMatch is O (if the attributes matching are orange),
                if (letterMatch.get(i).charAt(1) == 'O') {
                    //display that all the cards are orange.
                    lblDisplayMatches3.setText("All the cards are orange.");
                }
                //if the second character in the i spot in letterMatch is Y (if the attributes matching are yellow),
                if (letterMatch.get(i).charAt(1) == 'Y') {
                    //display that all the cards are yellow.
                    lblDisplayMatches3.setText("All the cards are yellow.");
                }
            }
            //if the first character in the i spot in letterMatch is 0 (if the attribute corresponds to small, medium, or big),
            if (letterMatch.get(i).charAt(0) == '3') {
                //if the second character in the i spot in letterMatch is S (if the attributes matching are small),
                if (letterMatch.get(i).charAt(1) == 'S') {
                    //display that all the cards are small.
                    lblDisplayMatches4.setText("All the cards have small objects.");
                }
                //if the second character in the i spot in letterMatch is M (if the attributes matching are medium),
                if (letterMatch.get(i).charAt(1) == 'M') {
                    //display that all the cards are medium.
                    lblDisplayMatches4.setText("All the cards have medium objects.");
                }
                //if the second character in the i spot in letterMatch is B (if the attributes matching are big),
                if (letterMatch.get(i).charAt(1) == 'B') {
                    //display that all the cards are big.
                    lblDisplayMatches4.setText("All the cards have big objects.");
                }
            }
        }
    }
    //clears letter match labels that may have been there from before.
    public void clearLetterMatch() {
        //clears all 4 letter match labels.
        lblDisplayMatches1.setText("");
        lblDisplayMatches2.setText("");
        lblDisplayMatches3.setText("");
        lblDisplayMatches4.setText("");
    }
    //clears points labels that may have been there from before.
    public void clearPoints() {
        //clears all 4 points labels.
        lblDisplayP1Pts.setText("");
        lblDisplayP2Pts.setText("");
        lblDisplayP3Pts.setText("");
        lblDisplayP4Pts.setText("");
    }
    //endGame method which ends the game.
    public void endGame() {
        //if there are 2 players,
        if (players == 2) {
            //if player 1 has more points than player 2,
            if (p1Pts > p2Pts) {
                //displays that player 1 wins.
                lblDisplayError.setText("Player 1 wins!");
            }
            //if player 2 has more points than player 1,
            if (p2Pts > p1Pts) {
                //displays that player 2 wins.
                lblDisplayError.setText("Player 2 wins!");
            }
            //if player 1 has the same points as player 2,
            if (p1Pts == p2Pts) {
                //displays that there is a tie.
                lblDisplayError.setText("There is a tie.");
            }
        }
        //if there are 3 players,
        if (players == 3) {
            //if player 3 has more points than player 2 and player 1,
            if (p3Pts > p2Pts && p3Pts > p1Pts) {
                //displays that player 3 wins.
                lblDisplayError.setText("Player 3 wins!");
            }
            //if player 2 has more points than player 3 and player 1,
            if (p2Pts > p3Pts && p2Pts > p1Pts) {
                //displays that player 2 wins.
                lblDisplayError.setText("Player 2 wins!");
            }
            //if player 1 has more points than player 3 and player 2,
            if (p1Pts > p3Pts && p1Pts > p2Pts) {
                //displays that player 1 wins.
                lblDisplayError.setText("Player 1 wins!");
            }
            //if player 1 has the same points as player 2 and player 3,
            if (p1Pts == p2Pts && p2Pts == p3Pts) {
                //displays that there is a tie.
                lblDisplayError.setText("There is a tie.");
            }
        }
        //if there are 4 players,
        if (players == 4) {
            //if player 4 has more points than player 1, player 2, and player 3,
            if (p4Pts > p1Pts && p4Pts > p2Pts && p4Pts > p3Pts) {
                //displays that player 4 wins.
                lblDisplayError.setText("Player 4 wins!");
            }
            //if player 3 has more points than player 1, player 2, and player 4,
            if (p3Pts > p1Pts && p3Pts > p2Pts && p3Pts > p4Pts) {
                //displays that player 3 wins.
                lblDisplayError.setText("Player 3 wins!");
            }
            //if player 2 has more points than player 1, player 3, and player 4,
            if (p2Pts > p1Pts && p2Pts > p3Pts && p2Pts > p4Pts) {
                //displays that player 2 wins.
                lblDisplayError.setText("Player 2 wins!");
            }
            //if player 1 has more points than player 2, player 3, and player 4,
            if (p1Pts > p2Pts && p1Pts > p3Pts && p1Pts > p4Pts) {
                //displays that player 1 wins.
                lblDisplayError.setText("Player 1 wins!");
            }
            //if player 1 has the same points as player 2, player 3, and player 4,
            if (p1Pts == p2Pts && p2Pts == p3Pts && p3Pts == p4Pts) {
                //displays that there is a tie.
                lblDisplayError.setText("There is a tie.");
            }
        }
        //clears letter match labels that may have been there from before.
        clearLetterMatch();
        //clears status display.
        lblDisplayStatus.setText("");
        //makes restart button visible.
        btnRestart.setVisible(true);
        //sets cardNum to 0.
        cardNum = 0;
        //displays the possible points.
        displayPtsPossible();
    }
    //method which finds how many spots on the board have cards.
    public int getCardAmt() {
        //sets a test integer to 0.
        int test = 0;
        //double loop that runs for all image views in boardImageView.
        //loop that runs 4 times.
        for (int i = 0; i < 4; i++) {
            //loop that runs 5 times.
            for (int j = 0; j < 5; j++) {
                //if the corresponding image view in boardImageView is not null (if there is an image/card there),
                if (!(boardImageView[i][j].getImage() == null)) {
                    //add 1 to test.
                    test++;
                }
            }
        }
        //returns test.
        return test;
    }
    //method which restarts the game.
    public void restartGame() {
        //double loop that runs for all image views in boardImageView.
        //loop that runs 4 times.
        for (int i = 0; i < 4; i++) {
            //loop that runs 5 times.
            for (int j = 0; j < 5; j++) {
                //sets the corresponding image view to null.
                boardImageView[i][j].setImage(null);
            }
        }
        //clears the noEndMatch label.
        lblDisplayNoEndMatch.setText("");
        //sets every player's points to 0.
        p1Pts = 0;
        p2Pts = 0;
        p3Pts = 0;
        p4Pts = 0;
        //clears the error label.
        lblDisplayError.setText("");
        //runs the initialize method to restart the game.
        initialize();
        //enables the player selection listview.
        txtPlayers.setDisable(false);
    }
}