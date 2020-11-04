package seedu.address.logic.parser;

import static seedu.address.commons.core.Messages.MESSAGE_INVALID_COMMAND_FORMAT;

import seedu.address.commons.core.index.Index;
import seedu.address.logic.commands.LessonDeleteCommand;
import seedu.address.logic.parser.exceptions.ParseException;

/**
 * Parses input arguments and creates a new LessonDeleteCommand object
 */
public class LessonDeleteCommandParser implements Parser<LessonDeleteCommand> {

    /**
     * Parses the given {@code String} of arguments in the context of the LessonDeleteCommand
     * and returns a LessonDeleteCommand object for execution.
     * @throws ParseException if the user input does not conform the expected format
     */
    public LessonDeleteCommand parse(String args) throws ParseException {
        if (args.isEmpty()) {
            throw new ParseException(
                    String.format(MESSAGE_INVALID_COMMAND_FORMAT, LessonDeleteCommand.MESSAGE_USAGE));
        }

        Index index = ParserUtil.parseIndex(args);
        return new LessonDeleteCommand(index);
    }

}
