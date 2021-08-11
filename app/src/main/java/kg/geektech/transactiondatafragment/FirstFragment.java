package kg.geektech.transactiondatafragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class FirstFragment extends Fragment {

    private EditText editText;
    private Button button;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        editText = view.findViewById(R.id.first_et);
        button = view.findViewById(R.id.first_btn);

        button.setOnClickListener(view1 -> {
            FIvFragment fragment5 = new FIvFragment();
            Bundle bundle = new Bundle();
            bundle.putString("aaa", editText.getText().toString());
            fragment5.setArguments(bundle);
            getFragmentManager().beginTransaction().add(R.id.main_cont, fragment5).commit();
            FirstFragment.this.getFragmentManager().beginTransaction().replace(R.id.main_cont, fragment5).commit();
        });
    }
}