
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class JdkBug {

  public static void main(String args[]) {
    List<String> commandList = Arrays.asList("command1", "command2", "command3");

    Optional<String> optionalCommandMarker = Optional.of("command2");

    Stream<CommandConfig> commandConfig = commandList.stream().map(command -> {
      return new CommandConfig(command, optionalCommandMarker.map(command::equalsIgnoreCase).orElse(false));
    });
    
    commandConfig.forEach(System.out::println);
  }

  private static class CommandConfig {
    private String command;
    private boolean isMarked;

    public CommandConfig(String command, boolean isMarked) {
      this.command = command;
      this.isMarked = isMarked;
    }

    @Override
    public String toString() {
      return "CommandConfig [command=" + command + ", isMarked=" + isMarked + "]";
    }
  }
}
