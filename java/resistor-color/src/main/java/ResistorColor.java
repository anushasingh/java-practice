import java.util.Arrays;
import java.util.List;

class ResistorColor {
    private String[] colors = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
	private List<String> colorList = Arrays.asList(colors);

    public int colorCode(String _color) {
		return colorList.indexOf(_color);
    }

    public String[] colors() {
        return colors;
    }
}