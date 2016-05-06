package com.lol.workingwithfragments;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;


public class DetailsDialogFragment extends DialogFragment {

    final static String EXTRA_TEXT = "EXTRA_TEXT";
    final static String EXTRA_ENTERED_TEXT = "EXTRA_ENTERED_TEXT";

    public static DetailsDialogFragment newInstance(String text){
        Bundle args = new Bundle();
        args.putSerializable(EXTRA_TEXT, text);

        DetailsDialogFragment fragment = new DetailsDialogFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        View root = getActivity().getLayoutInflater().inflate(R.layout.fragment_details_dialog, null);

        String extraText = getArguments().getString(EXTRA_TEXT);
        TextView textView = (TextView)root.findViewById(R.id.textViewDialogUuid);
        textView.setText(extraText);

        final EditText editTextDialog = (EditText)root.findViewById(R.id.editTextDialog);

        return new AlertDialog.Builder(getActivity()).setView(root)
                                                    .setTitle("Enter your name")
                                                    .setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() {
                                                        @Override
                                                        public void onClick(DialogInterface dialog, int which) {
                                                            sendResult(0, editTextDialog.getText().toString());
                                                        }
                                                    })
                                                    .create();
    }

    private void sendResult(int resultCode, String enteredText) {
        if(getTargetFragment() == null){
            Log.e("", "target fragment null");
        }

        Intent intent = new Intent();
        intent.putExtra(EXTRA_ENTERED_TEXT, enteredText);

        getTargetFragment().onActivityResult(getTargetRequestCode(), resultCode, intent);

    }
}
