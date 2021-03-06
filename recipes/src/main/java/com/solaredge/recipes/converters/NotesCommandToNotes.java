package com.solaredge.recipes.converters;

import com.solaredge.recipes.commands.CategoryCommand;
import com.solaredge.recipes.commands.NotesCommand;
import com.solaredge.recipes.domain.Category;
import com.solaredge.recipes.domain.Notes;
import lombok.Synchronized;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Component
public class NotesCommandToNotes implements Converter<NotesCommand, Notes> {

    @Synchronized
    @Nullable
    @Override
    public Notes convert(NotesCommand source) {
        if (source == null) {
            return null;
        }
        return new Notes(source.getId(), source.getRecipeNotes(), null);
    }
}
