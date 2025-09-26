// Mobile Application Development Practical Guide (Short Java - J2ME)

// Practical 1: Hello World
import javax.microedition.midlet.*;
import javax.microedition.lcdui.*;
public class HelloWorld extends MIDlet {
    public void startApp() {
        Display.getDisplay(this).setCurrent(new Form("Hello", new StringItem(null, "Hello World!")));
    }
    public void pauseApp() {}
    public void destroyApp(boolean u) {}
}

// Practical 2: Menu with Options
public class MenuExample extends MIDlet implements CommandListener {
    List menu = new List("Menu", List.IMPLICIT);
    public void startApp() {
        String[] items = {"Cut", "Copy", "Paste", "Delete", "Select All", "Unselect All"};
        for (String item : items) menu.append(item, null);
        menu.addCommand(new Command("Exit", Command.EXIT, 1));
        menu.setCommandListener(this);
        Display.getDisplay(this).setCurrent(menu);
    }
    public void commandAction(Command c, Displayable d) { notifyDestroyed(); }
    public void pauseApp() {}
    public void destroyApp(boolean u) {}
}

// Practical 3: Phone Number Format Validation
public class PhoneValidator extends MIDlet implements CommandListener {
    TextBox input = new TextBox("Phone", "", 20, TextField.PHONENUMBER);
    public void startApp() {
        input.addCommand(new Command("Check", Command.OK, 1));
        input.setCommandListener(this);
        Display.getDisplay(this).setCurrent(input);
    }
    public void commandAction(Command c, Displayable d) {
        String num = input.getString();
        String msg = num.matches("(040|041|050|0400|044)\\d{6,8}") ? "Valid" : "Invalid";
        Display.getDisplay(this).setCurrent(new Alert("Result", msg, null, AlertType.INFO));
    }
    public void pauseApp() {}
    public void destroyApp(boolean u) {}
}

// Practical 4: Quiz App (1 MCQ)
public class QuizApp extends MIDlet implements CommandListener {
    ChoiceGroup q = new ChoiceGroup("Capital of India?", Choice.EXCLUSIVE);
    Form form = new Form("Quiz");
    public void startApp() {
        q.append("Mumbai", null); q.append("Delhi", null); q.append("Kolkata", null);
        form.append(q);
        form.addCommand(new Command("Submit", Command.OK, 1));
        form.setCommandListener(this);
        Display.getDisplay(this).setCurrent(form);
    }
    public void commandAction(Command c, Displayable d) {
        String msg = (q.getSelectedIndex() == 1) ? "Correct" : "Wrong";
        Display.getDisplay(this).setCurrent(new Alert("Score", msg, null, AlertType.INFO));
    }
    public void pauseApp() {}
    public void destroyApp(boolean u) {}
}

// Practical 5: Image Slideshow (Auto-Rotate)
public class SlideShow extends MIDlet implements Runnable {
    Image[] slides; int index = 0;
    Canvas canvas = new Canvas() {
        protected void paint(Graphics g) { g.drawImage(slides[index], 0, 0, Graphics.TOP | Graphics.LEFT); }
    };
    public void startApp() {
        try {
            slides = new Image[]{Image.createImage("/1.png"), Image.createImage("/2.png"), Image.createImage("/3.png")};
        } catch (Exception e) {}
        Display.getDisplay(this).setCurrent(canvas);
        new Thread(this).start();
    }
    public void run() {
        while (true) {
            try { Thread.sleep(5000); index = (index + 1) % slides.length; canvas.repaint(); } catch (Exception e) {}
        }
    }
    public void pauseApp() {}
    public void destroyApp(boolean u) {}
}

// Practical 6: RMS for Top Player
import javax.microedition.rms.*;
public class RMSExample extends MIDlet implements CommandListener {
    TextField name = new TextField("Name", "", 20, TextField.ANY);
    TextField score = new TextField("Score", "", 5, TextField.NUMERIC);
    Form form = new Form("Score Entry");
    RecordStore rs;
    public void startApp() {
        form.append(name); form.append(score);
        form.addCommand(new Command("Save", Command.OK, 1));
        form.addCommand(new Command("Show", Command.SCREEN, 2));
        form.setCommandListener(this);
        Display.getDisplay(this).setCurrent(form);
        try { rs = RecordStore.openRecordStore("Scores", true); } catch (Exception e) {}
    }
    public void commandAction(Command c, Displayable d) {
        String label = c.getLabel();
        try {
            if (label.equals("Save")) {
                String data = name.getString() + "," + score.getString();
                rs.addRecord(data.getBytes(), 0, data.length());
            } else if (label.equals("Show")) {
                StringBuffer sb = new StringBuffer();
                RecordEnumeration re = rs.enumerateRecords(null, null, false);
                while (re.hasNextElement()) sb.append(new String(rs.getRecord(re.nextRecordId())) + "\n");
                Display.getDisplay(this).setCurrent(new Alert("Top Scores", sb.toString(), null, AlertType.INFO));
            }
        } catch (Exception e) {}
    }
    public void pauseApp() {}
    public void destroyApp(boolean u) {}
}
