import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.nurzhigit_ishenov_hw_6_m_3.databinding.FragmentCountryBinding

class CountryFragment : Fragment() {
    private lateinit var binding: FragmentCountryBinding
    private lateinit var adapter: CountryAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentCountryBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val countries = listOf("China", "Russia", "Brazil", "Kyrgyzstan", "Peru", "Sweden", "Denmark", "Uzbekistan")
        adapter = CountryAdapter(requireContext(), countries)
        binding.rvCountry.adapter = adapter
    }
}
