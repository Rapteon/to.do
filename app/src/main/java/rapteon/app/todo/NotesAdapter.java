package rapteon.app.todo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class NotesAdapter extends RecyclerView.Adapter<NotesAdapter.NoteHolder> {
    private List<String> notesList;
    public NotesAdapter(List<String> notesList){
        this.notesList = notesList;
    }
    @NonNull
    @Override
    public NoteHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        TextView toReturn = (TextView) LayoutInflater.from(parent.getContext()).inflate(R.layout.note_box, parent, false);
        NoteHolder currentHolder = new NoteHolder(toReturn);

        return currentHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull NoteHolder holder, int position) {
        holder.noteData.setText(notesList.get(position));
    }

    @Override
    public int getItemCount() {
        return notesList.size();
    }

    public static class NoteHolder extends RecyclerView.ViewHolder {
        TextView noteData;
        public NoteHolder(@NonNull View itemView) {
            super(itemView);
            noteData = (TextView) itemView;
        }
    }
}
