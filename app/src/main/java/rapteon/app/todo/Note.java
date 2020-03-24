package rapteon.app.todo;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

//Extending the ViewHolder. Currently no methods need to be used or overridden.
//Have made the class 'Note' as the ViewHolder's derived class, since we are displaying a collection of 'Note' objects, instead of ViewHolders.
//However the Note *is a* ViewHolder.(IS-A relationship).

public class Note extends RecyclerView.ViewHolder{

    public Note(@NonNull View itemView) {
        super(itemView);

    }
}
