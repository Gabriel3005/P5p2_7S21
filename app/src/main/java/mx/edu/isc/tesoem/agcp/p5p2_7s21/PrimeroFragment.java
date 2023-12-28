package mx.edu.isc.tesoem.agcp.p5p2_7s21;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link PrimeroFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class PrimeroFragment extends Fragment {

    EditText num1, num2;

    Button btncalcula;

    TextView lblresult;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public PrimeroFragment() {
        // Required empty public constructor
    }

    public static PrimeroFragment newInstance(String param1, String param2) {
        PrimeroFragment fragment = new PrimeroFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        return inflater.inflate(R.layout.fragment_primero, container, false);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        btncalcula = getView().findViewById(R.id.btncalsum);
        num1 = getView().findViewById(R.id.txtprimero);
        num2 = getView().findViewById(R.id.txtsegundo);
        lblresult = getView().findViewById(R.id.lblresult);
        btncalcula.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcularsuma();
            }
        });
    }

    private void calcularsuma(){
        int n1, n2;
        n1 = Integer.parseInt(num1.getText().toString());
        n2 = Integer.parseInt(num2.getText().toString());
        lblresult.setText(String.valueOf((n1+n2)));

   }

}