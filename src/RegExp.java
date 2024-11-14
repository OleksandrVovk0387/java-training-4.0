import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Regular expressions.
 */
public class RegExp {

    /**
     * Get IP address from text.
     *
     * @param text text to parse
     * @return String with IP address or an empty string if not found
     */
    public static String getIpAddress(String text) {
        // Regular expression to match valid IPv4 addresses
        String ipPattern = "\\b((25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)\\.){3}(25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)\\b";
        Pattern pattern = Pattern.compile(ipPattern);
        Matcher matcher = pattern.matcher(text);

        // Return the first found IP address or an empty string if not found
        return matcher.find() ? matcher.group() : "";
    }
}