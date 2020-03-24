package rapteon.app.todo.ui.tasks;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.Arrays;
import java.util.List;

import rapteon.app.todo.NotesAdapter;
import rapteon.app.todo.R;

public class TasksFragment extends Fragment {

    private RecyclerView noteViewRecycler;
    private RecyclerView.LayoutManager notesLayoutManager;
    private RecyclerView.ViewHolder noteViewHolder;
    private List<String> list;
    private NotesAdapter adapter;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        ViewModelProviders.of(this).get(TasksViewModel.class);
        View root = inflater.inflate(R.layout.fragment_tasks, container, false);

        noteViewRecycler = root.findViewById(R.id.notesRecyclerView);       //This line finds the RecyclerView from fragment_tasks.
        notesLayoutManager = new LinearLayoutManager(inflater.getContext());    //The Recycler uses LinearLayoutManager to fill itself with Views.
        noteViewRecycler.setLayoutManager(notesLayoutManager);      //Setting the LayoutManager for RecyclerView.
        list = Arrays.asList(getResources().getStringArray(R.array.notes));     //Obtaining data to display.
        adapter = new NotesAdapter(list);       //Creating NotesAdapter object manage views in this RecyclerView.
        noteViewRecycler.setHasFixedSize(true); //Since the data in Views won't change the size of the RecyclerView. (Helps performance).
        noteViewRecycler.setAdapter(adapter);   //Setting the Adapter for RecyclerView.
        return root;
    }
}
