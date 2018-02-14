package com.example.android.friendshipsimulator;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Scanner;

public class MainActivity extends AppCompatActivity {
    int buttonPress;
    int score=0;
    String score1;
    String decision="0";

    public MainActivity() {
        score1 = "Score: " + Integer.toString(score) + " Friends";
    }

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        start();


    }

    private void displayMessage(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.welcome);
        priceTextView.setText(message);
    }

    private void displayScore() {
        TextView scoreView = (TextView) findViewById(R.id.score);
        scoreView.setText("Score: " + score + " Friends");
    }

    public void scenario1(String i){
        switch (i) {
            case "01":displayMessage("He responds: Hello would you like to be friends?");
                    break;
                    case "011":displayMessage("Nice to meet you! Now take this mask and gun, we are gonna rob this place dry");
                        score++;
                        break;
                            case "0111":displayMessage("You suddenly yell at the cashier to take out all of the money in the register.  Right as the fearful cashier hands you the money you hear police sirens. You turn around and see five police officers with guns drawn.");
                                break;
                                    case "01111":displayMessage("You decide maybe you have had enough fun and talk to the police, trying to calm them down and put all the blame on your friend. You further explain that you were playing along and were going to isolate the robber and take him captive and call the police.  The police buy your story.  You have earned five friends.  They arrest the man in the baseball cap and invite you for coffee.");
                                        score=score+5;
                                        break;
                                            case "011111":displayMessage("You go to a coffee shop with your new police buddies.  As you are waiting for your order, a thin shaky man approaches you in a strange wobbly fashion. He is getting closer.");
                                                break;
                                                    case "0111111":displayMessage("Before you have the chance to say anything, the man rushes at you and shanks you with a rusty butter knife. You die.");

                                                        break;
                                                    case "0111112":displayMessage("You swiftly punch the man, who immediately falls to the floor and drops a rusty butter knife.  You stopped a man who was about to assault you. Your police buddies witness the situation and let out a hardy cheer!  They ask if you will come with them to the station to meet the chief of police.");
                                                        break;
                                                    case "0111113":displayMessage("Before you have the chance to kiss him, the man rushes at you and shanks you with a rusty butter knife. You die.");
                                                        break;
                                            case "011112":displayMessage("You swiftly punch the police...somehow. Unbeknown to you the entirety of the National Guard was also at this restaurant. They all drew weapons and are pointed at you.");

                                                break;
                                            case "011113":displayMessage("They accept your kiss, not really questioning it. The policemen exchange ambiguous looks with each other, and then ask if you want to skip coffee and go back to the station with them.");
                                                break;
                                    case "01112":displayMessage("You swiftly punch the police...somehow. Your robber friend is impressed.  The National Guard has now arrived at the scene.");

                                        break;
                                    case "01113":displayMessage("You attempt to defuse the situation by doing what nobody would expect. You open your arms lovingly and go in to kiss all of the policemen. Almost immediately they all open fire. You die.");
                                        break;
                            case "0112":displayMessage("You swiftly punch the robber in the face, the crowd around you witnessed the events and they all cheer.  You have earned 15 friends.  A young woman approaches you and informs you that your bravery has inspired her.  She asks you to go out for a drink.");
                                score=score+15;
                                break;
                                    case "01121":displayMessage("You talk with the young woman for hours but it only feels like minutes.  You two share laughs, drinks, and smiles.  She suddenly pauses and gazes into your eyes.  She then asks if you will come back home with her.");
                                        score++;
                                        break;
                                    case "01122":displayMessage("You swiftly punch her in the face. The once cheering crowd is now dead silent and in shock. You feel a security guard grab your shoulder. You turn to face the security guard.");
                                        score=score-15;
                                        break;
                                    case "01123":displayMessage("Feeling confident after your successful restaurant rescue, you decide to go straight in for the kiss. She is frozen in surprise for a brief second, and you pull back and see her blushing with a smile.  She asks if you will come with her.");
                                        score++;
                                        break;
                            case "0113":displayMessage("In a very Disney-esque fit of blind passion, you take the man into your arms and bestow upon him a loving kiss.  After what seems like a never ending silence, he sheds a single tear and leaves the restaurant. Love has showed him the way. A very large muscular man in a sailor hat approaches. He says: 'I like your straight forward attitude, let's go to my place.'");
                                break;
                                    case "01131":displayMessage("You agree and have made one friend.  You follow him into his car and the two of you hit the road. On the way back to his place you notice a black van has been following your every turn.");
                                        score++;
                                        break;
                                    case "01132":displayMessage("Before you can land a punch the man grabs your throat and shatters your wind pipe with his bare hand.  You died.");
                                        break;
                                    case "01133":displayMessage("Wow, you get right to the point now don't you?  The man in the sailor hat giggles and informs you that twelve of his friends will be joining the both of you.");
                                        score++;
                                        break;
                    case "012":displayMessage("You swiftly punch him in the face.  Security comes up to you.");
                        break;
                            case "0121":displayMessage("You attempt to strike up a conversation.  The security guard seems amused with your suave attitude but has not forgotten that you punched a random guy.  He asks you to leave.");
                                break;
                            case "0122":displayMessage("Before security has a chance to do anything, you swiftly punch the guard in the face.   A police officer runs into the building, with a gun pointed at you. He yells at you to get on the ground.");
                                break;
                            case "0123":displayMessage("You successfully calmed the security guard.  He tells you to have a nice day and he walks away. You earned one friend.  As you turn to continue about your business, a thin shaky man in a hood approaches you.  What do you do?");
                                score++;
                                break;
                                    case "01231":displayMessage("Before you have the chance to say anything, the man rushes at you and shanks you with a rusty butter knife. You die.");
                                        break;
                                    case "01232":displayMessage("You swiftly punch the man, who immediately falls to the floor and drops a rusty butter knife.  You stopped a man who was about to assault you.");
                                        break;
                                    case "01233":displayMessage("Before you have the chance to kiss him, the man rushes at you and shanks you with a rusty butter knife. You die.");
                                        break;
                    case "013":displayMessage("The man is very surprised and runs away crying.  You lost a potential friend");
                        break;
            case "02":displayMessage("You swiftly punch him in the face. Security comes up to you.");
                    break;
                    case "021":displayMessage("You attempt to strike up a conversation.  The security guard seems amused with your suave attitude but has not forgotten that you punched a random guy.  He asks you to leave.");
                        break;
                    case "022":displayMessage("Before security has a chance to do anything, you swiftly punch the guard in the face.   A police officer runs into the building, with a gun pointed at you. He yells at you to get on the ground.");
                        break;
                    case "023":displayMessage("You successfully calmed the security guard.  He tells you to have a nice day and he walks away. You earned one friend.  As you turn to continue about your business, a thin shaky man in a hood approaches you.  What do you do?");
                        score++;
                        break;
            case "03":displayMessage("The man in the baseball cap is very surprised and runs away crying.  You lost a potential friend. Next time try not to express your feelings.  A very large muscular man in a sailor hat approaches. He says: 'I like your straight forward attitude, let's go to my place.'");
                    break;
                    case "031":displayMessage("You agree and have made one friend.  You follow him into his car and the two of you hit the road. On the way back to his place you notice a black van has been following your every turn.");
                        score++;
                        break;
                            case "0311":displayMessage("You point out the black van to the muscular man in the sailor hat. He looks out the rear view mirror and mutters 'oh fuck'.  He throws off his sailor hat and slams the acceleration.");
                                break;
                            case "0312":displayMessage("You punch the muscular man with the sailor hat in the face. The car swerves and hits a stop sign. A loaded Glock falls out of the passenger glove box.  The sailor hat man is unconscious. You turn your head to see five men in black suits each with an uzi walking towards you.");
                                break;
                            case "0313":displayMessage("You lean over and kiss the muscular man with the sailor hat. He giggles a bit. All of a sudden you hear a spattering of gunfire coming from the black van behind you.  The muscular man in the sailor hat mutters 'god dammit', throws off his hat, and slams on the acceleration");
                                break;
                    case "032":displayMessage("Before you can land a punch the man grabs your throat and shatters your wind pipe with his bare hand.  You died.");
                        break;
                    case "033":displayMessage("Wow, you get right to the point now don't you?  The man in the sailor hat giggles and informs you that twelve of his friends will be joining the both of you.");
                        score++;
                        break;
        }
    }

    public void start(){
                displayMessage("You are standing in line at a restaurant. A man in a baseball cap approaches you, what do you do?");

    }

    public void talk(View view){
        decision=decision+"1";
        scenario1(decision);
        displayScore();
    }

    public void attack(View view){
        decision=decision+"2";
        scenario1(decision);
        displayScore();
    }

    public void kiss(View view){
        decision=decision+"3";
        scenario1(decision);
        displayScore();

    }

}
