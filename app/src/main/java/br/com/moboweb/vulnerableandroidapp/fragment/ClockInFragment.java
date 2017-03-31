package br.com.moboweb.vulnerableandroidapp.fragment;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import br.com.moboweb.vulnerableandroidapp.R;

/**
 * @author Everton Takashi Nishiyama <everton.nishiyama@venturus.org.br>
 * @version 1.0
 * @since 3/31/17
 */

public class ClockInFragment extends Fragment {
    public static final String TAG = "ClockInFragment";
    private SharedPreferences mDefaultSharedPrefs;

    public ClockInFragment() {
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mDefaultSharedPrefs = PreferenceManager.getDefaultSharedPreferences(getActivity());
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.content_clock_in, container, false);

        return rootView;
    }
}
