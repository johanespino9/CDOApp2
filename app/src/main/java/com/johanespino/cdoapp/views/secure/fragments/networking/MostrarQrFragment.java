package com.johanespino.cdoapp.views.secure.fragments.networking;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.johanespino.cdoapp.R;
import com.johanespino.cdoapp.views.core.fragments.AbsQrFragment;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MostrarQrFragment extends AbsQrFragment {

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

}
