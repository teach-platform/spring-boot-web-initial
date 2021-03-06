package com.starter.architecture.services;

import com.starter.architecture.domain.Note;
import com.starter.architecture.repositories.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoteService {

    final private NoteRepository noteRepository;

    @Autowired
    public NoteService(NoteRepository noteRepository) {
        this.noteRepository = noteRepository;
    }

    public List<Note> getAll() {
        return (List<Note>)noteRepository.findAll();
    }

    public Note save(Note note) {
        return noteRepository.save(note);
    }
}
