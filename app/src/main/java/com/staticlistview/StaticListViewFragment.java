package com.quickprogrammingtips.examples;

        import android.os.Bundle;

        import android.support.annotation.Nullable;

        import android.support.v4.app.Fragment;

        import android.view.LayoutInflater;

        import android.view.View;

        import android.view.ViewGroup;
        import android.widget.ArrayAdapter;

        import android.widget.ListView;

        import com.staticlistview.R;


public class StaticListViewFragment extends Fragment {
    private static String[] MOBILE_MODELS = {"iPhone 6","Nexus 6","Moto G","HTC One","Galaxy S5","Sony Xperia Z2","Lumia 830","Galaxy Grand 2"};
    public static StaticListViewFragment newInstance() {

        Bundle args = new Bundle();

        StaticListViewFragment fragment = new StaticListViewFragment();

        fragment.setArguments(args);

        return fragment;
    }

    @Override

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View mainView = inflater.inflate(R.layout.staticlistviewmain, container, false);

        ListView listView = (ListView) mainView.findViewById(R.id.listView);

        listView.setAdapter(new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,MOBILE_MODELS));

        return mainView;
    }

}
