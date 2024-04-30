import java.util.List;

public class StringBuilder {
    private String string = "";

    public StringBuilder append(char character) {
        this.string += character;
        return this;
    }

    public StringBuilder appendCharacters(List<Character> characters) {
        for (Character character : characters) {
            append(character);
        }
        return this;
    }

    public StringBuilder insert(Character character, int position) {
        this.string = this.string.substring(0, position) + character + this.string.substring(position, this.string.length());
        return this;
    }

    public StringBuilder insertCharacters(List<Character> characters, int position) throws Exception {
        if (position > this.string.length()) {
            throw new Exception("Illegal Position");
        }
        for (Character character : characters) {
            insert(character, position);
            position += 1;
        }
        return this;
    }

    @Override
    public String toString() {
        return this.string;
    }
}
