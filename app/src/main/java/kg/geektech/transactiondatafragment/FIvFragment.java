package kg.geektech.transactiondatafragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class FIvFragment extends Fragment {

    private TextView textView;
    private Button btnFive;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_f_iv, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        textView = view.findViewById(R.id.fifth_tv);
        btnFive = view.findViewById(R.id.fifth_btn);

        Bundle bundle = getArguments();

        btnFive.setOnClickListener(view1 -> {
            String txt = bundle.getString("aaa");
            textView.setText(txt);
        });



    }
}