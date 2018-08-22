package com.johanespino.cdoapp.views.secure.fragments.networking;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.johanespino.cdoapp.R;
import com.johanespino.cdoapp.views.core.fragments.AbsQrFragment;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/*
 * https://code.tutsplus.com/es/tutorials/quick-tip-using-butter-knife-to-inject-views-on-android--cms-23542
 * http://jakewharton.github.io/butterknife/
 */
public class LeerQrFragment extends AbsQrFragment {

    @BindView(R.id.tvMessage)
    TextView tvMessage;
    @BindView(R.id.qrView)
    View qrView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frag_qr_read, parent, false);
        ButterKnife.bind(this, view);
        return view;
    }

    @OnClick(R.id.qrView)
    void onClickQRView(){
        Toast.makeText(getContext(), "Prueba de click", Toast.LENGTH_LONG).show();
    }

}