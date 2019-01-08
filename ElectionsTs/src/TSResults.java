
import java.awt.Color;
import java.awt.Font;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.DefaultCategoryDataset;

public class TSResults extends javax.swing.JFrame {

    public TSResults() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        resultButton = new javax.swing.JButton();
        reportPanel = new javax.swing.JPanel();
        textPanel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        locName = new javax.swing.JComboBox<>();
        consLabel = new javax.swing.JLabel();
        leader = new javax.swing.JLabel();
        headingLabel = new javax.swing.JLabel();
        party = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(800, 547));

        jPanel2.setBackground(new java.awt.Color(204, 214, 223));
        jPanel2.setLayout(new javax.swing.BoxLayout(jPanel2, javax.swing.BoxLayout.LINE_AXIS));

        resultButton.setText("Get Result");
        resultButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultButtonActionPerformed(evt);
            }
        });

        reportPanel.setBackground(new java.awt.Color(204, 214, 223));
        reportPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "REPORT", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cambria", 0, 14), new java.awt.Color(51, 51, 51))); // NOI18N
        reportPanel.setLayout(new javax.swing.BoxLayout(reportPanel, javax.swing.BoxLayout.LINE_AXIS));

        textPanel.setForeground(new java.awt.Color(102, 102, 102));
        textPanel.setLayout(null);

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\prosh\\Downloads\\untitled.png")); // NOI18N
        textPanel.add(jLabel6);
        jLabel6.setBounds(40, 30, 630, 310);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("EVERY VOTE IS COUNTABLE");
        textPanel.add(jLabel1);
        jLabel1.setBounds(40, 10, 270, 20);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("EVERY LEADER IS ACCOUNTABLE");
        textPanel.add(jLabel3);
        jLabel3.setBounds(370, 350, 310, 14);

        reportPanel.add(textPanel);

        locName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Achampet", "Adilabad", "Alair", "Alampur", "Amberpet", "Andole", "Armur", "Asifabad", "Aswaraopeta", "Bahadurpura", "Balkonda", "Banswada", "Bellampalli", "Bhadrachalam", "Bhongir", "Bhupalpalle", "Boath", "Bodhan", "Chandrayangutta", "Charminar", "Chennur", "Chevella", "Choppadandi", "Devarakonda", "Devarkadra", "Dharmapuri", "Dornakal", "Dubbak", "Gadwal", "Gajwel", "Ghanpur", "Goshamahal", "Husnabad", "Huzurabad", "Huzurnagar", "Ibrahimpatnam", "Jadcherla", "Jagityal", "Jangoan", "Jubliee Hills", "Jukkal", "Kalwakurthy", "Kamareddy", "Karimnagar", "Karwan", "Khairatabad", "Khammam", "Khanapur", "Kodad", "Kodangal", "Kollapur", "Koratla", "Kothagudem", "Kukatpally", "Lal Bahadur Nagar", "Madhira", "Mahabubabad", "Mahbubnagar", "Maheshwaram", "Makthal", "Malakpet", "Malkajgiri", "Manakondur", "Mancherial", "Manthani", "Medak", "Medchal", "Miryalguda", "Mudhole", "Mulug", "Munugode", "Musheerabad", "Nagarjuna Sagar", "Nagarkurnool", "Nakrekal", "Nalgonda", "Nampalli", "Narayankhed", "Narayanpet", "Narsampet", "Narsapur", "Nirmal", "Nizamabad(Rural)", "Nizamabad(Urban)", "Palair", "Palakurthi", "Pargi", "Parkal", "Patancheru", "Peddapalle", "Pinapaka", "Quthbullapur", "Rajendranagar", "Ramagundam", "Sanath Nagar", "Sangareddy", "Sathupall", "Secunderabad", "Secuderabad Cantt.", "Serilingampally", "Shadnagar", "Siddipet", "Sircilla", "Sirpur", "Suryapet", "Tandur", "Thungathurthy", "Uppal", "Vemulawada", "Vikarabad", "Wanaparthy", "Warangal East", "Warangal West", "Wardhanapet", "Wyra", "Yakutpura", "Yellandu", "Yellareddy", "Zahirabad" }));

        consLabel.setText("Constituency:");

        leader.setEnabled(false);

        headingLabel.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        headingLabel.setText("TELANGANA  STATE  ELECTION  POLL  RESULTS 2018");

        party.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(reportPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(231, Short.MAX_VALUE)
                .addComponent(consLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(locName, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(298, 298, 298))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(leader, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(party, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(318, 318, 318)
                        .addComponent(resultButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(headingLabel)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(228, 228, 228)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(headingLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(locName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(consLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(party, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(leader, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(reportPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(resultButton))
        );

        leader.setVisible(false);
        party.setVisible(false);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void resultButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultButtonActionPerformed

        reportPanel.removeAll();
        reportPanel.add(textPanel);
        reportPanel.updateUI();
        String Name = locName.getItemAt(locName.getSelectedIndex());
        if("None".equals(Name)){
            leader.setVisible(false);
            party.setVisible(false);
            textPanel.setVisible(true);
        }else{
            DefaultCategoryDataset dcd = new DefaultCategoryDataset();
            leader.setEnabled(true);
            leader.setVisible(true);
            party.setEnabled(true);
            party.setVisible(true);
            
            drawGraph(dcd,Name);
            JFreeChart jchart = ChartFactory.createBarChart(Name.toUpperCase(),"","Number of Votes", dcd, PlotOrientation.VERTICAL, true,true,false);
        
            CategoryPlot plot =  jchart.getCategoryPlot();
            plot.setBackgroundPaint(new Color(124,252,0));
            plot.setRangeGridlinePaint(Color.DARK_GRAY);
            BarRenderer br = (BarRenderer) plot.getRenderer();
            br.setMaximumBarWidth(.08); 
            br.setSeriesPaint(0, new Color(228,12,12));
        
            ChartPanel chartPanel = new ChartPanel(jchart);
            reportPanel.removeAll();
            reportPanel.add(chartPanel);
            reportPanel.updateUI();
        }
    }//GEN-LAST:event_resultButtonActionPerformed

    private void drawGraph(DefaultCategoryDataset dcd, String Name){
        Font font = new Font("Times New Roman", Font.PLAIN, 16);
        if(Name == "Achampet"){
            dcd.setValue(88073,"Political Party", "TRS");
            dcd.setValue(78959,"Political Party", "INC");
            dcd.setValue(3222,"Political Party", "BJP");
            leader.setText("Leader: " + " GUVVALA BALARAJU");
            party.setText("Party: "+" TELANGANA RASHTRA SAMITHI");
            leader.setForeground(Color.RED);
            party.setForeground(Color.RED);
            leader.setFont(font);
            party.setFont(font);
        }else if(Name == "Adilabad"){
            dcd.setValue(74050,"Political Party", "TRS");
            dcd.setValue(47444,"Political Party", "BJP");
            dcd.setValue(32200,"Political Party", "INC");
            leader.setText("Leader: " + " JOGU RAMANNA");
            party.setText("Party: "+" TELANGANA RASHTRA SAMITHI");
            leader.setForeground(Color.RED);
            party.setForeground(Color.RED);
            leader.setFont(font);
            party.setFont(font);
        }else if(Name == "Alair"){
            dcd.setValue(94870,"Political Party", "TRS");
            dcd.setValue(61784,"Political Party", "INC");
            dcd.setValue(11923,"Political Party", "BSP");
            leader.setText("Leader: " + " GONGIDI SUNEETHA");
            party.setText("Party: "+" TELANGANA RASHTRA SAMITHI");
            leader.setForeground(Color.RED);
            party.setForeground(Color.RED);
            leader.setFont(font);
            party.setFont(font);
        }else if(Name == "Alampur"){
            dcd.setValue(102105,"Political Party", "TRS");
            dcd.setValue(57426,"Political Party", "INC");
            dcd.setValue(8803,"Political Party", "SIFB");
            leader.setText("Leader: " + " V.M. ABRAHAM");
            party.setText("Party: "+" TELANGANA RASHTRA SAMITHI");
            leader.setForeground(Color.RED);
            party.setForeground(Color.RED);
            leader.setFont(font);
            party.setFont(font);
        }else if(Name == "Amberpet"){
            dcd.setValue(61558,"Political Party", "TRS");
            dcd.setValue(60542,"Political Party", "BJP");
            dcd.setValue(4261,"Political Party", "INC");
            leader.setText("Leader: " + " K. VENKATESHAM");
            party.setText("Party: "+" TELANGANA RASHTRA SAMITHI");
            leader.setForeground(Color.RED);
            party.setForeground(Color.RED);
            leader.setFont(font);
            party.setFont(font);
        }else if(Name == "Andole"){
            dcd.setValue(104229,"Political Party", "TRS");
            dcd.setValue(87764,"Political Party", "INC");
            dcd.setValue(2404,"Political Party", "BJP");
            leader.setText("Leader: " + " KRANTHI KIRAN");
            party.setText("Party: "+" TELANGANA RASHTRA SAMITHI");
            leader.setForeground(Color.RED);
            party.setForeground(Color.RED);
            leader.setFont(font);
            party.setFont(font);
        }else if(Name == "Armur"){
            dcd.setValue(72125,"Political Party", "TRS");
            dcd.setValue(43330,"Political Party", "INC");
            dcd.setValue(19599,"Political Party", "BJP");
            leader.setText("Leader: " + " JEEVAN REDDY");
            party.setText("Party: "+" TELANGANA RASHTRA SAMITHI");
            leader.setForeground(Color.RED);
            party.setForeground(Color.RED);
            leader.setFont(font);
            party.setFont(font);
        }else if(Name == "Asifabad"){
            dcd.setValue(65788,"Political Party", "INC");
            dcd.setValue(65617,"Political Party", "TRS");
            dcd.setValue(6711,"Political Party", "BJP");
            leader.setText("Leader: " + " ATHRAM SAKKU");
            party.setText("Party: "+" INDIAN NATIONAL CONGRESS");
            leader.setForeground(Color.RED);
            party.setForeground(Color.RED);
            leader.setFont(font);
            party.setFont(font);
        }else if(Name == "Aswaraopeta"){
            dcd.setValue(61124,"Political Party", "TDP");
            dcd.setValue(48007,"Political Party", "TRS");
            dcd.setValue(4955,"Political Party", "CPI");
            leader.setText("Leader: " + " NAGESHWARA RAO");
            party.setText("Party: "+" TELUGU DESAM PARTY");
            leader.setForeground(Color.RED);
            party.setForeground(Color.RED);
            leader.setFont(font);
            party.setFont(font);
        }else if(Name == "Bahadurpura"){
            dcd.setValue(96993,"Political Party", "AIMIM");
            dcd.setValue(14475,"Political Party", "TRS");
            dcd.setValue(7395,"Political Party", "BJP");
            leader.setText("Leader: " + " MOHD MOAZAM KHAN");
            party.setText("Party: "+" AIMIM");
            leader.setForeground(Color.RED);
            party.setForeground(Color.RED);
            leader.setFont(font);
            party.setFont(font);
        }else if(Name == "Balkonda"){
            dcd.setValue(73662,"Political Party", "TRS");
            dcd.setValue(41254,"Political Party", "BSP");
            dcd.setValue(30433,"Political Party", "INC");
            leader.setText("Leader: " + " VEMULA PRASHANTH");
            party.setText("Party: "+" TELANGANA RASHTRA SAMITHI");
            leader.setForeground(Color.RED);
            party.setForeground(Color.RED);
            leader.setFont(font);
            party.setFont(font);
        }else if(Name == "Banswada"){
            dcd.setValue(77943,"Political Party", "TRS");
            dcd.setValue(59458,"Political Party", "INC");
            dcd.setValue(2998,"Political Party", "BJP");
            leader.setText("Leader: " + " POCHARAM SRINIVAS");
            party.setText("Party: "+" TELANGANA RASHTRA SAMITHI");
            leader.setForeground(Color.RED);
            party.setForeground(Color.RED);
            leader.setFont(font);
            party.setFont(font);
        }else if(Name == "Bellampalli"){
            dcd.setValue(55026,"Political Party", "TRS");
            dcd.setValue(43750,"Political Party", "BSP");
            dcd.setValue(10684,"Political Party", "IND");
            leader.setText("Leader: " + " DURGAM CHINNAIAH");
            party.setText("Party: "+" TELANGANA RASHTRA SAMITHI");
            leader.setForeground(Color.RED);
            party.setForeground(Color.RED);
            leader.setFont(font);
            party.setFont(font);
        }else if(Name == "Bhadrachalam"){
            dcd.setValue(47746,"Political Party", "INC");
            dcd.setValue(35961,"Political Party", "TRS");
            dcd.setValue(14228,"Political Party", "CPI");
            leader.setText("Leader: " + " PODEM VEERAIAH");
            party.setText("Party: "+" INDIAN NATIONAL CONGRESS");
            leader.setForeground(Color.RED);
            party.setForeground(Color.RED);
            leader.setFont(font);
            party.setFont(font);
        }else if(Name == "Bhongir"){
            dcd.setValue(85476,"Political Party", "TRS");
            dcd.setValue(61413,"Political Party", "INC");
            dcd.setValue(13427,"Political Party", "YTP");
            leader.setText("Leader: " + " PAILA SHANKAR");
            party.setText("Party: "+" TELANGANA RASHTRA SAMITHI");
            leader.setForeground(Color.RED);
            party.setForeground(Color.RED);
            leader.setFont(font);
            party.setFont(font);
        }else if(Name == "Bhupalpalle"){
            dcd.setValue(69918,"Political Party", "INC");
            dcd.setValue(54283,"Political Party", "AIFB");
            dcd.setValue(53567,"Political Party", "TRS");
            leader.setText("Leader: " + " VENKATA RAMANA");
            party.setText("Party: "+" INDIAN NATIONAL CONGRESS");
            leader.setForeground(Color.RED);
            party.setForeground(Color.RED);
            leader.setFont(font);
            party.setFont(font);
        }else if(Name == "Boath"){
            dcd.setValue(61125,"Political Party", "TRS");
            dcd.setValue(54639,"Political Party", "INC");
            dcd.setValue(28206,"Political Party", "IND");
            leader.setText("Leader: " + " BAPU RAO RATHOD");
            party.setText("Party: "+" TELANGANA RASHTRA SAMITHI");
            leader.setForeground(Color.RED);
            party.setForeground(Color.RED);
            leader.setFont(font);
            party.setFont(font);
        }else if(Name == "Bodhan"){
            dcd.setValue(74895,"Political Party", "TRS");
            dcd.setValue(66794,"Political Party", "INC");
            dcd.setValue(8434,"Political Party", "BJP");
            leader.setText("Leader: " + " AAMIR MOHAMMED");
            party.setText("Party: "+" TELANGANA RASHTRA SAMITHI");
            leader.setForeground(Color.RED);
            party.setForeground(Color.RED);
            leader.setFont(font);
            party.setFont(font);
        }else if(Name == "Chandrayangutta"){
            dcd.setValue(95339,"Political Party", "AIMIM");
            dcd.setValue(15075,"Political Party", "BJP");
            dcd.setValue(14224,"Political Party", "TRS");
            leader.setText("Leader: " + " AKBARUDDIN OWAISI");
            party.setText("Party: "+" AIMIM");
            leader.setForeground(Color.RED);
            party.setForeground(Color.RED);
            leader.setFont(font);
            party.setFont(font);
        }else if(Name == "Charminar"){
            dcd.setValue(53808,"Political Party", "AIMIM");
            dcd.setValue(21222,"Political Party", "BJP");
            dcd.setValue(16899,"Political Party", "INC");
            leader.setText("Leader: " + " AHMED KHAN");
            party.setText("Party: "+" AIMIM");
            leader.setForeground(Color.RED);
            party.setForeground(Color.RED);
            leader.setFont(font);
            party.setFont(font);
        }else if(Name == "Chennur"){
            dcd.setValue(71980,"Political Party", "TRS");
            dcd.setValue(43848,"Political Party", "INC");
            dcd.setValue(6274,"Political Party", "RPI");
            leader.setText("Leader: " + " BALKA SUMAN");
            party.setText("Party: "+" TELANGANA RASHTRA SAMITHI");
            leader.setForeground(Color.RED);
            party.setForeground(Color.RED);
            leader.setFont(font);
            party.setFont(font);
        }else if(Name == "Chevella"){
            dcd.setValue(99168,"Political Party", "TRS");
            dcd.setValue(65616,"Political Party", "INC");
            dcd.setValue(5474,"Political Party", "BJP");
            leader.setText("Leader: " + " KALE YADAIAH");
            party.setText("Party: "+" TELANGANA RASHTRA SAMITHI");
            leader.setForeground(Color.RED);
            party.setForeground(Color.RED);
            leader.setFont(font);
            party.setFont(font);
        }else if(Name == "Choppadandi"){
            dcd.setValue(91090,"Political Party", "TRS");
            dcd.setValue(48963,"Political Party", "INC");
            dcd.setValue(15835,"Political Party", "BJP");
            leader.setText("Leader: " + " RAVI SHANKAR");
            party.setText("Party: "+" TELANGANA RASHTRA SAMITHI");
            leader.setForeground(Color.RED);
            party.setForeground(Color.RED);
            leader.setFont(font);
            party.setFont(font);
        }else if(Name == "Devarakonda"){
            dcd.setValue(96454,"Political Party", "TRS");
            dcd.setValue(57606,"Political Party", "INC");
            dcd.setValue(19350,"Political Party", "BJP");
            leader.setText("Leader: " + " RAVINDRA KUMAR");
            party.setText("Party: "+" TELANGANA RASHTRA SAMITHI");
            leader.setForeground(Color.RED);
            party.setForeground(Color.RED);
            leader.setFont(font);
            party.setFont(font);
        }else if(Name == "Devarkadra"){
            dcd.setValue(96130,"Political Party", "TRS");
            dcd.setValue(60882,"Political Party", "INC");
            dcd.setValue(5937,"Political Party", "SFB");
            leader.setText("Leader: " + " VENKATESHWARA REDDY");
            party.setText("Party: "+" TELANGANA RASHTRA SAMITHI");
            leader.setForeground(Color.RED);
            party.setForeground(Color.RED);
            leader.setFont(font);
            party.setFont(font);
        }else if(Name == "Dharmapuri"){
            dcd.setValue(70579,"Political Party", "TRS");
            dcd.setValue(70138,"Political Party", "INC");
            dcd.setValue(13114,"Political Party", "IND");
            leader.setText("Leader: " + " ESHWAR KOPPULA");
            party.setText("Party: "+" TELANGANA RASHTRA SAMITHI");
            leader.setForeground(Color.RED);
            party.setForeground(Color.RED);
            leader.setFont(font);
            party.setFont(font);
        }else if(Name == "Dornakal"){
            dcd.setValue(88307,"Political Party", "TRS");
            dcd.setValue(70926,"Political Party", "INC");
            dcd.setValue(4117,"Political Party", "IND");
            leader.setText("Leader: " + " REDYA NAIK");
            party.setText("Party: "+" TELANGANA RASHTRA SAMITHI");
            leader.setForeground(Color.RED);
            party.setForeground(Color.RED);
            leader.setFont(font);
            party.setFont(font);
        }else if(Name == "Dubbak"){
            dcd.setValue(89299,"Political Party", "TRS");
            dcd.setValue(26799,"Political Party", "INC");
            dcd.setValue(22595,"Political Party", "BJP");
            leader.setText("Leader: " + " RAMALINGA REDDY");
            party.setText("Party: "+" TELANGANA RASHTRA SAMITHI");
            leader.setForeground(Color.RED);
            party.setForeground(Color.RED);
            leader.setFont(font);
            party.setFont(font);
        }else if(Name == "Gadwal"){
            dcd.setValue(100415,"Political Party", "TRS");
            dcd.setValue(72155,"Political Party", "INC");
            dcd.setValue(7189,"Political Party", "SFB");
            leader.setText("Leader: " + " KRISHNAMOHAN REDDY");
            party.setText("Party: "+" TELANGANA RASHTRA SAMITHI");
            leader.setForeground(Color.RED);
            party.setForeground(Color.RED);
            leader.setFont(font);
            party.setFont(font);
        }else if(Name == "Gajwel"){
            dcd.setValue(125444,"Political Party", "TRS");
            dcd.setValue(67154,"Political Party", "INC");
            dcd.setValue(3353,"Political Party", "IND");
            leader.setText("Leader: " + " CHANDRASHEKAR RAO");
            party.setText("Party: "+" TELANGANA RASHTRA SAMITHI");
            leader.setForeground(Color.RED);
            party.setForeground(Color.RED);
            leader.setFont(font);
            party.setFont(font);
        }else if(Name == "Ghanpur"){
            dcd.setValue(98612,"Political Party", "TRS");
            dcd.setValue(62822,"Political Party", "INC");
            dcd.setValue(22774,"Political Party", "BSP");
            leader.setText("Leader: " + " THATIKONDA RAJAIAH");
            party.setText("Party: "+" TELANGANA RASHTRA SAMITHI");
            leader.setForeground(Color.RED);
            party.setForeground(Color.RED);
            leader.setFont(font);
            party.setFont(font);
        }else if(Name == "Goshamahal"){
            dcd.setValue(61854,"Political Party", "BJP");
            dcd.setValue(44120,"Political Party", "TRS");
            dcd.setValue(26322,"Political Party", "INC");
            leader.setText("Leader: " + " RAJA SINGH");
            party.setText("Party: "+" BHARATIYA JANATA PARTY");
            leader.setForeground(Color.RED);
            party.setForeground(Color.RED);
            leader.setFont(font);
            party.setFont(font);
        }else if(Name == "Husnabad"){
            dcd.setValue(117083,"Political Party", "TRS");
            dcd.setValue(46553,"Political Party", "CPI");
            dcd.setValue(4556,"Political Party", "TIP");
            leader.setText("Leader: " + " SATISH KUMAR");
            party.setText("Party: "+" TELANGANA RASHTRA SAMITHI");
            leader.setForeground(Color.RED);
            party.setForeground(Color.RED);
            leader.setFont(font);
            party.setFont(font);
        }else if(Name == "Huzurabad"){
            dcd.setValue(104840,"Political Party", "TRS");
            dcd.setValue(61121,"Political Party", "INC");
            dcd.setValue(2867,"Political Party", "NOTA");
            leader.setText("Leader: " + " ETALA RAJENDAR");
            party.setText("Party: "+" TELANGANA RASHTRA SAMITHI");
            leader.setForeground(Color.RED);
            party.setForeground(Color.RED);
            leader.setFont(font);
            party.setFont(font);
        }else if(Name == "Huzurnagar"){
            dcd.setValue(92996,"Political Party", "INC");
            dcd.setValue(85530,"Political Party", "TRS");
            dcd.setValue(4944,"Political Party", "IND");
            leader.setText("Leader: " + " UTTAM KUMAR");
            party.setText("Party: "+"  INDIAN NATIONAL CONGRESS");
            leader.setForeground(Color.RED);
            party.setForeground(Color.RED);
            leader.setFont(font);
            party.setFont(font);
        }else if(Name == "Ibrahimpatnam"){
            dcd.setValue(72581,"Political Party", "TRS");
            dcd.setValue(72205,"Political Party", "BSP");
            dcd.setValue(18053,"Political Party", "TDP");
            leader.setText("Leader: " + " KRISHNA REDDY");
            party.setText("Party: "+" TELANGANA RASHTRA SAMITHI");
            leader.setForeground(Color.RED);
            party.setForeground(Color.RED);
            leader.setFont(font);
            party.setFont(font);
        }else if(Name == "Jadcherla"){
            dcd.setValue(94598,"Political Party", "TRS");
            dcd.setValue(49516,"Political Party", "INC");
            dcd.setValue(3601,"Political Party", "BJP");
            leader.setText("Leader: " + " LAXMA REDDY");
            party.setText("Party: "+" TELANGANA RASHTRA SAMITHI");
            leader.setForeground(Color.RED);
            party.setForeground(Color.RED);
            leader.setFont(font);
            party.setFont(font);
        }else if(Name == "Jagityal"){
            dcd.setValue(104247,"Political Party", "TRS");
            dcd.setValue(43062,"Political Party", "INC");
            dcd.setValue(4817,"Political Party", "BJP");
            leader.setText("Leader: " + " SANJAY KUMAR");
            party.setText("Party: "+" TELANGANA RASHTRA SAMITHI");
            leader.setForeground(Color.RED);
            party.setForeground(Color.RED);
            leader.setFont(font);
            party.setFont(font);
        }else if(Name == "Jangoan"){
            dcd.setValue(91592,"Political Party", "TRS");
            dcd.setValue(62024,"Political Party", "INC");
            dcd.setValue(10031,"Political Party", "SFP");
            leader.setText("Leader: " + " YADAGIRI REDDY");
            party.setText("Party: "+" TELAGANA RASHTRA SAMITHI");
            leader.setForeground(Color.RED);
            party.setForeground(Color.RED);
            leader.setFont(font);
            party.setFont(font);
        }else if(Name == "Jubliee Hills"){
            dcd.setValue(68979,"Political Party", "TRS");
            dcd.setValue(52975,"Political Party", "INC");
            dcd.setValue(18817,"Political Party", "IND");
            leader.setText("Leader: " + " MAGANTI GOPINATH");
            party.setText("Party: "+" TELANGANA RASHTRA SAMITHI");
            leader.setForeground(Color.RED);
            party.setForeground(Color.RED);
            leader.setFont(font);
            party.setFont(font);
        }else if(Name == "Jukkal"){
            dcd.setValue(77584,"Political Party", "TRS");
            dcd.setValue(41954,"Political Party", "INC");
            dcd.setValue(18840,"Political Party", "BJP");
            leader.setText("Leader: " + " HANMANTH SHINDE");
            party.setText("Party: "+" TELANGANA RASHTRA SAMITHI");
            leader.setForeground(Color.RED);
            party.setForeground(Color.RED);
            leader.setFont(font);
            party.setFont(font);
        }else if(Name == "Kalwakurthy"){
            dcd.setValue(62892,"Political Party", "TRS");
            dcd.setValue(59445,"Political Party", "BJP");
            dcd.setValue(46523,"Political Party", "INC");
            leader.setText("Leader: " + " JAIPAL YADAV");
            party.setText("Party: "+" TELANGANA RASHTRA SAMITHI");
            leader.setForeground(Color.RED);
            party.setForeground(Color.RED);
            leader.setFont(font);
            party.setFont(font);
        }else if(Name == "Kamareddy"){
            dcd.setValue(68167,"Political Party", "TRS");
            dcd.setValue(63610,"Political Party", "INC");
            dcd.setValue(15439,"Political Party", "BJP");
            leader.setText("Leader: " + " GAMPA GOVARDHAN");
            party.setText("Party: "+" TELANGANA RASHTRA SAMITHI");
            leader.setForeground(Color.RED);
            party.setForeground(Color.RED);
            leader.setFont(font);
            party.setFont(font);
        }else if(Name == "Karimnagar"){
            dcd.setValue(80983,"Political Party", "TRS");
            dcd.setValue(66009,"Political Party", "BJP");
            dcd.setValue(39500,"Political Party", "INC");
            leader.setText("Leader: " + " GANGULA KAMALAKAR");
            party.setText("Party: "+" TELANGANA RASHTRA SAMITHI");
            leader.setForeground(Color.RED);
            party.setForeground(Color.RED);
            leader.setFont(font);
            party.setFont(font);
        }else if(Name == "Karwan"){
            dcd.setValue(87586,"Political Party", "AIMIM");
            dcd.setValue(37417,"Political Party", "BJP");
            dcd.setValue(24699,"Political Party", "TRS");
            leader.setText("Leader: " + " KAUSAR MOHIUDDIN");
            party.setText("Party: "+" AIMIM");
            leader.setForeground(Color.RED);
            party.setForeground(Color.RED);
            leader.setFont(font);
            party.setFont(font);
        }else if(Name == "Khairtabad"){
            dcd.setValue(63068,"Political Party", "TRS");
            dcd.setValue(34666,"Political Party", "BJP");
            dcd.setValue(33549,"Political Party", "INC");
            leader.setText("Leader: " + " DANAM NAGENDAR");
            party.setText("Party: "+" TELANGANA RASHTRA SAMITHI");
            leader.setForeground(Color.RED);
            party.setForeground(Color.RED);
            leader.setFont(font);
            party.setFont(font);
        }else if(Name == "Khammam"){
            dcd.setValue(102760,"Political Party", "TRS");
            dcd.setValue(91769,"Political Party", "TD");
            dcd.setValue(3513,"Political Party", "NOTA");
            leader.setText("Leader: " + " AJAY KUMAR");
            party.setText("Party: "+" TELANGANA RASHTRA SAMITHI");
            leader.setForeground(Color.RED);
            party.setForeground(Color.RED);
            leader.setFont(font);
            party.setFont(font);
        }else if(Name == "Khanapur"){
            dcd.setValue(67138,"Political Party", "TRS");
            dcd.setValue(46428,"Political Party", "INC");
            dcd.setValue(23779,"Political Party", "BJP");
            leader.setText("Leader: " + " AJMIRA REKHA");
            party.setText("Party: "+" TELANGANA RASHTRA SAMITHI");
            leader.setForeground(Color.RED);
            party.setForeground(Color.RED);
            leader.setFont(font);
            party.setFont(font);
        }else if(Name == "Kodad"){
            dcd.setValue(89115,"Political Party", "TRS");
            dcd.setValue(88359,"Political Party", "INC");
            dcd.setValue(5240,"Political Party", "IND");
            leader.setText("Leader: " + " MALLAIAH YADAV");
            party.setText("Party: "+" TELANGANA RASHTRA SAMITHI");
            leader.setForeground(Color.RED);
            party.setForeground(Color.RED);
            leader.setFont(font);
            party.setFont(font);
        }else if(Name == "Kodangal"){
            dcd.setValue(80754,"Political Party", "TRS");
            dcd.setValue(71435,"Political Party", "INC");
            dcd.setValue(4171,"Political Party", "IND");
            leader.setText("Leader: " + " NARENDAR REDDY");
            party.setText("Party: "+" TELANGANA RASHTRA SAMITHI");
            leader.setForeground(Color.RED);
            party.setForeground(Color.RED);
            leader.setFont(font);
            party.setFont(font);
        }else if(Name == "Kollapur"){
            dcd.setValue(80611,"Political Party", "INC");
            dcd.setValue(68068,"Political Party", "TRS");
            dcd.setValue(13154,"Political Party", "BJP");
            leader.setText("Leader: " + " HARSHAVARDHAN REDDY");
            party.setText("Party: "+" INDIAN NATIONAL CONGRESS");
            leader.setForeground(Color.RED);
            party.setForeground(Color.RED);
            leader.setFont(font);
            party.setFont(font);
        }else if(Name == "Koratla"){
            dcd.setValue(84605,"Political Party", "TRS");
            dcd.setValue(53385,"Political Party", "INC");
            dcd.setValue(16046,"Political Party", "BJP");
            leader.setText("Leader: " + " VIDYASAGAR RAO");
            party.setText("Party: "+" TELANGANA RASHTRA SAMITHI");
            leader.setForeground(Color.RED);
            party.setForeground(Color.RED);
            leader.setFont(font);
            party.setFont(font);
        }else if(Name == "Kothagudem"){
            dcd.setValue(81118,"Political Party", "INC");
            dcd.setValue(76979,"Political Party", "TRS");
            dcd.setValue(5520,"Political Party", "BLP");
            leader.setText("Leader: " + " VENKATESHWARA RAO");
            party.setText("Party: "+" INDIAN NATIONAL CONGRESS");
            leader.setForeground(Color.RED);
            party.setForeground(Color.RED);
            leader.setFont(font);
            party.setFont(font);
        }else if(Name == "Kukatpally"){
            dcd.setValue(111612,"Political Party", "TRS");
            dcd.setValue(70563,"Political Party", "TDP");
            dcd.setValue(12761,"Political Party", "BSP");
            leader.setText("Leader: " + " KRISHNA RAO");
            party.setText("Party: "+" TELANGANA RASHTRA SAMITHI");
            leader.setForeground(Color.RED);
            party.setForeground(Color.RED);
            leader.setFont(font);
            party.setFont(font);
        }else if(Name == "Lal Bahadur Nagar"){
            dcd.setValue(113980,"Political Party", "INC");
            dcd.setValue(96132,"Political Party", "TRS");
            dcd.setValue(21502,"Political Party", "BJP");
            leader.setText("Leader: " + " SUDHEER REDDY");
            party.setText("Party: "+" INDIAN NATIONAL CONGRESS");
            leader.setForeground(Color.RED);
            party.setForeground(Color.RED);
            leader.setFont(font);
            party.setFont(font);
        }else if(Name == "Madhira"){
            dcd.setValue(80598,"Political Party", "INC");
            dcd.setValue(77031,"Political Party", "TRS");
            dcd.setValue(23030,"Political Party", "BLP");
            leader.setText("Leader: " + " VIKRAMARKA MALLU");
            party.setText("Party: "+" INDIAN NATIONAL CONGRESS");
            leader.setForeground(Color.RED);
            party.setForeground(Color.RED);
            leader.setFont(font);
            party.setFont(font);
        }else if(Name == "Mahabubabad"){
            dcd.setValue(85397,"Political Party", "TRS");
            dcd.setValue(71863,"Political Party", "INC");
            dcd.setValue(11646,"Political Party", "BJP");
            leader.setText("Leader: " + " SHANKAR  NAIK");
            party.setText("Party: "+" TELANGANA RASHTRA SAMITHI");
            leader.setForeground(Color.RED);
            party.setForeground(Color.RED);
            leader.setFont(font);
            party.setFont(font);
        }else if(Name == "Mahbubnagar"){
            dcd.setValue(86474,"Political Party", "TRS");
            dcd.setValue(28699,"Political Party", "TDP");
            dcd.setValue(21664,"Political Party", "BSP");
            leader.setText("Leader: " + " SRINIVAS GOUD");
            party.setText("Party: "+" TELANGANA RASHTRA SAMITHI");
            leader.setForeground(Color.RED);
            party.setForeground(Color.RED);
            leader.setFont(font);
            party.setFont(font);
        }else if(Name == "Maheshwaram"){
            dcd.setValue(95481,"Political Party", "INC");
            dcd.setValue(86254,"Political Party", "TRS");
            dcd.setValue(39445,"Political Party", "BJP");
            leader.setText("Leader: " + " SAVITHA INDIRA REDDY");
            party.setText("Party: "+" INDIAN NATIONAL CONGRESS");
            leader.setForeground(Color.RED);
            party.setForeground(Color.RED);
            leader.setFont(font);
            party.setFont(font);
        }else if(Name == "Makthal"){
            dcd.setValue(78686,"Political Party", "TRS");
            dcd.setValue(30371,"Political Party", "IND");
            dcd.setValue(26579,"Political Party", "TD");
            leader.setText("Leader: " + " RAMMOHAN REDDY");
            party.setText("Party: "+" TELANGANA RASHTRA SAMITHI");
            leader.setForeground(Color.RED);
            party.setForeground(Color.RED);
            leader.setFont(font);
            party.setFont(font);
        }else if(Name == "Malakpet"){
            dcd.setValue(53281,"Political Party", "AIMIM");
            dcd.setValue(29769,"Political Party", "TDP");
            dcd.setValue(20880,"Political Party", "BJP");
            leader.setText("Leader: " + " ABDULLAH BALALA");
            party.setText("Party: "+" AIMIM");
            leader.setForeground(Color.RED);
            party.setForeground(Color.RED);
            leader.setFont(font);
            party.setFont(font);
        }else if(Name == "Malkajgiri"){
            dcd.setValue(114149,"Political Party", "TRS");
            dcd.setValue(40451,"Political Party", "BJP");
            dcd.setValue(34219,"Political Party", "TJS");
            leader.setText("Leader: " + " HANUMANTH RAO");
            party.setText("Party: "+" TELANGANA RASHTRA SAMITHI");
            leader.setForeground(Color.RED);
            party.setForeground(Color.RED);
            leader.setFont(font);
            party.setFont(font);
        }else if(Name == "Manakondur"){
            dcd.setValue(88997,"Political Party", "TRS");
            dcd.setValue(57488,"Political Party", "INC");
            dcd.setValue(13610,"Political Party", "SFB");
            leader.setText("Leader: " + " BALAKISHAN RASAMAYI");
            party.setText("Party: "+" TELANGANA RASHTRA SAMITHI");
            leader.setForeground(Color.RED);
            party.setForeground(Color.RED);
            leader.setFont(font);
            party.setFont(font);
        }else if(Name == "Mancherial"){
            dcd.setValue(75630,"Political Party", "TRS");
            dcd.setValue(70512,"Political Party", "INC");
            dcd.setValue(5018,"Political Party", "BJP");
            leader.setText("Leader: " + " DIWAKAR RAO");
            party.setText("Party: "+" TELANGANA RASHTRA SAMITHI");
            leader.setForeground(Color.RED);
            party.setForeground(Color.RED);
            leader.setFont(font);
            party.setFont(font);
        }else if(Name == "Manthani"){
            dcd.setValue(89045,"Political Party", "INC");
            dcd.setValue(72815,"Political Party", "TRS");
            dcd.setValue(5457,"Political Party", "SFB");
            leader.setText("Leader: " + " SRIDHAR BABU");
            party.setText("Party: "+" INDIAN NATIONAL CONGRESS");
            leader.setForeground(Color.RED);
            party.setForeground(Color.RED);
            leader.setFont(font);
            party.setFont(font);
        }else if(Name == "Medak"){
            dcd.setValue(97670,"Political Party", "TRS");
            dcd.setValue(49687,"Political Party", "INC");
            dcd.setValue(6947,"Political Party", "SFB");
            leader.setText("Leader: " + " DEVENDER REDDY");
            party.setText("Party: "+" TELANGANA RASHTRA SAMITHI");
            leader.setForeground(Color.RED);
            party.setForeground(Color.RED);
            leader.setFont(font);
            party.setFont(font);
        }else if(Name == "Medchal"){
            dcd.setValue(167324,"Political Party", "TRS");
            dcd.setValue(79334,"Political Party", "INC");
            dcd.setValue(25829,"Political Party", "BSP");
            leader.setText("Leader: " + " MALLA REDDY");
            party.setText("Party: "+" TELANGANA RASHTRA SAMITHI");
            leader.setForeground(Color.RED);
            party.setForeground(Color.RED);
            leader.setFont(font);
            party.setFont(font);
        }else if(Name == "Miryalaguda"){
            dcd.setValue(83931,"Political Party", "TRS");
            dcd.setValue(53279,"Political Party", "INC");
            dcd.setValue(13961,"Political Party", "IND");
            leader.setText("Leader: " + " BHASKAR RAO");
            party.setText("Party: "+" TELANGANA RASHTRA SAMITHI");
            leader.setForeground(Color.RED);
            party.setForeground(Color.RED);
            leader.setFont(font);
            party.setFont(font);
        }else if(Name == "Mudhole"){
            dcd.setValue(83933,"Political Party", "TRS");
            dcd.setValue(40602,"Political Party", "BJP");
            dcd.setValue(36580,"Political Party", "INC");
            leader.setText("Leader: " + " VITTAL REDDY");
            party.setText("Party: "+" TELANGANA RASHTRA SAMITHI");
            leader.setForeground(Color.RED);
            party.setForeground(Color.RED);
            leader.setFont(font);
            party.setFont(font);
        }else if(Name == "Mulug"){
            dcd.setValue(88971,"Political Party", "INC");
            dcd.setValue(66300,"Political Party", "TRS");
            dcd.setValue(3348,"Political Party", "IND");
            leader.setText("Leader: " + " ANASUYA DANSARI");
            party.setText("Party: "+" INDIAN NATIONAL CONGRESS");
            leader.setForeground(Color.RED);
            party.setForeground(Color.RED);
            leader.setFont(font);
            party.setFont(font);
        }else if(Name == "Munugode"){
            dcd.setValue(97239,"Political Party", "INC");
            dcd.setValue(74687,"Political Party", "TRS");
            dcd.setValue(12725,"Political Party", "BJP");
            leader.setText("Leader: " + " RAJGOPAL REDDY");
            party.setText("Party: "+" INDIAN NATIONAL CONGRESS");
            leader.setForeground(Color.RED);
            party.setForeground(Color.RED);
            leader.setFont(font);
            party.setFont(font);
        }else if(Name == "Musheerabad"){
            dcd.setValue(72997,"Political Party", "TRS");
            dcd.setValue(36087,"Political Party", "INC");
            dcd.setValue(30813,"Political Party", "BJP");
            leader.setText("Leader: " + " MUTA GOPAL");
            party.setText("Party: "+" TELANGANA RASHTRA SAMITHI");
            leader.setForeground(Color.RED);
            party.setForeground(Color.RED);
            leader.setFont(font);
            party.setFont(font);
        }else if(Name == "Nagarjuna Sagar"){
            dcd.setValue(83655,"Political Party", "TRS");
            dcd.setValue(75884,"Political Party", "INC");
            dcd.setValue(9819,"Political Party", "SFB");
            leader.setText("Leader: " + " NARSIMHAIAH");
            party.setText("Party: "+" TELANGANA RASHTRA SAMITHI");
            leader.setForeground(Color.RED);
            party.setForeground(Color.RED);
            leader.setFont(font);
            party.setFont(font);
        }else if(Name == "Nagarkurnool"){
            dcd.setValue(102493,"Political Party", "TRS");
            dcd.setValue(48139,"Political Party", "INC");
            dcd.setValue(5545,"Political Party", "SFB");
            leader.setText("Leader: " + " JANARDHAN REDDY");
            party.setText("Party: "+" TELANGANA RASHTRA SAMITHI");
            leader.setForeground(Color.RED);
            party.setForeground(Color.RED);
            leader.setFont(font);
            party.setFont(font);
        }else if(Name == "Nakrekal"){
            dcd.setValue(93699,"Political Party", "INC");
            dcd.setValue(85440,"Political Party", "TRS");
            dcd.setValue(10383,"Political Party", "SFB");
            leader.setText("Leader: " + " LINGAIAH");
            party.setText("Party: "+" INDIAN NATIONAL CONGRESS");
            leader.setForeground(Color.RED);
            party.setForeground(Color.RED);
            leader.setFont(font);
            party.setFont(font);
        }else if(Name == "Nalgonda"){
            dcd.setValue(98792,"Political Party", "TRS");
            dcd.setValue(75094,"Political Party", "INC");
            dcd.setValue(2932,"Political Party", "IND");
            leader.setText("Leader: " + " BHUPAL REDDY");
            party.setText("Party: "+" TELANGANA RASHTRA SAMITHI");
            leader.setForeground(Color.RED);
            party.setForeground(Color.RED);
            leader.setFont(font);
            party.setFont(font);
        }else if(Name == "Nampally"){
            dcd.setValue(57940,"Political Party", "AIMIM");
            dcd.setValue(48265,"Political Party", "INC");
            dcd.setValue(17015,"Political Party", "TRS");
            leader.setText("Leader: " + " JAFFAR HUSSAIN");
            party.setText("Party: "+" AIMIM");
            leader.setForeground(Color.RED);
            party.setForeground(Color.RED);
            leader.setFont(font);
            party.setFont(font);
        }else if(Name == "Narayankhed"){
            dcd.setValue(95550,"Political Party", "TRS");
            dcd.setValue(37042,"Political Party", "INC");
            dcd.setValue(33060,"Political Party", "BJP");
            leader.setText("Leader: " + " BHUPAL REDDY");
            party.setText("Party: "+" TELANGANA RASHTRA SAMITHI");
            leader.setForeground(Color.RED);
            party.setForeground(Color.RED);
            leader.setFont(font);
            party.setFont(font);
        }else if(Name == "Narayanpet"){
            dcd.setValue(68767,"Political Party", "TRS");
            dcd.setValue(53580,"Political Party", "BLP");
            dcd.setValue(20111,"Political Party", "BJP");
            leader.setText("Leader: " + " RAJENDAR REDDY");
            party.setText("Party: "+" TELANGANA RASHTRA SAMITHI");
            leader.setForeground(Color.RED);
            party.setForeground(Color.RED);
            leader.setFont(font);
            party.setFont(font);
        }else if(Name == "Narsampet"){
            dcd.setValue(94135,"Political Party", "TRS");
            dcd.setValue(77186,"Political Party", "INC");
            dcd.setValue(9025,"Political Party", "IND");
            leader.setText("Leader: " + " SUDHARSHAN REDDY");
            party.setText("Party: "+" TELANGANA RASHTRA SAMITHI");
            leader.setForeground(Color.RED);
            party.setForeground(Color.RED);
            leader.setFont(font);
            party.setFont(font);
        }else if(Name == "Narsapur"){
            dcd.setValue(105665,"Political Party", "TRS");
            dcd.setValue(67345,"Political Party", "INC");
            dcd.setValue(2848,"Political Party", "BJP");
            leader.setText("Leader: " + " MADHAN REDDY");
            party.setText("Party: "+" TELANGANA RASHTRA SAMITHI");
            leader.setForeground(Color.RED);
            party.setForeground(Color.RED);
            leader.setFont(font);
            party.setFont(font);
        }else if(Name == "Nirmal"){
            dcd.setValue(79985,"Political Party", "TRS");
            dcd.setValue(70714,"Political Party", "INC");
            dcd.setValue(16900,"Political Party", "BJP");
            leader.setText("Leader: " + " INDRA KARAN REDDY");
            party.setText("Party: "+" TELANGANA RASHTRA SAMITHI");
            leader.setForeground(Color.RED);
            party.setForeground(Color.RED);
            leader.setFont(font);
            party.setFont(font);
        }else if(Name == "Nizamabad(Rural)"){
            dcd.setValue(87976,"Political Party", "TRS");
            dcd.setValue(58330,"Political Party", "INC");
            dcd.setValue(16467,"Political Party", "BJP");
            leader.setText("Leader: " + " BAJIREDDY GOVARDHAN");
            party.setText("Party: "+" TELANGANA RASHTRA SAMITHI");
            leader.setForeground(Color.RED);
            party.setForeground(Color.RED);
            leader.setFont(font);
            party.setFont(font);
        }else if(Name == "Nizamabad(Urban)"){
            dcd.setValue(71896,"Political Party", "TRS");
            dcd.setValue(46055,"Political Party", "INC");
            dcd.setValue(24192,"Political Party", "BJP");
            leader.setText("Leader: " + " BIGALA GANESH");
            party.setText("Party: "+" TELANGANA RASHTRA SAMITHI");
            leader.setForeground(Color.RED);
            party.setForeground(Color.RED);
            leader.setFont(font);
            party.setFont(font);
        }else if(Name == "Palair"){
            dcd.setValue(89407,"Political Party", "INC");
            dcd.setValue(81738,"Political Party", "TRS");
            dcd.setValue(6769,"Political Party", "CPI");
            leader.setText("Leader: " + " UPENDAR REDDY");
            party.setText("Party: "+" INDIAN NATIONAL CONGRESS");
            leader.setForeground(Color.RED);
            party.setForeground(Color.RED);
            leader.setFont(font);
            party.setFont(font);
        }else if(Name == "Palakurthy"){
            dcd.setValue(117504,"Political Party", "TRS");
            dcd.setValue(64451,"Political Party", "INC");
            dcd.setValue(3199,"Political Party", "SFB");
            leader.setText("Leader: " + " DAYAKAR RAO");
            party.setText("Party: "+" TELANGANA RASHTRA SAMITHI");
            leader.setForeground(Color.RED);
            party.setForeground(Color.RED);
            leader.setFont(font);
            party.setFont(font);
        }else if(Name == "Pargi"){
            dcd.setValue(83467,"Political Party", "TRS");
            dcd.setValue(67626,"Political Party", "INC");
            dcd.setValue(8694,"Political Party", "SFB");
            leader.setText("Leader: " + " MAHESH REDDY");
            party.setText("Party: "+" TELANGANA RASHTRA SAMITHI");
            leader.setForeground(Color.RED);
            party.setForeground(Color.RED);
            leader.setFont(font);
            party.setFont(font);
        }else if(Name == "Parkal"){
            dcd.setValue(105903,"Political Party", "TRS");
            dcd.setValue(59384,"Political Party", "INC");
            dcd.setValue(3996,"Political Party", "IND");
            leader.setText("Leader: " + " DHARMA REDDY");
            party.setText("Party: "+" TELANGANA RASHTRA SAMITHI");
            leader.setForeground(Color.RED);
            party.setForeground(Color.RED);
            leader.setFont(font);
            party.setFont(font);
        }else if(Name == "Patancheru"){
            dcd.setValue(116474,"Political Party", "TRS");
            dcd.setValue(78775,"Political Party", "INC");
            dcd.setValue(7428,"Political Party", "BJP");
            leader.setText("Leader: " + " MAHIPAL REDDY");
            party.setText("Party: "+" TELANGANA RASHTRA SAMITHI");
            leader.setForeground(Color.RED);
            party.setForeground(Color.RED);
            leader.setFont(font);
            party.setFont(font);
        }else if(Name == "Peddapalle"){
            dcd.setValue(82765,"Political Party", "TRS");
            dcd.setValue(74299,"Political Party", "INC");
            dcd.setValue(9375,"Political Party", "BJP");
            leader.setText("Leader: " + " MANOHAR REDDY");
            party.setText("Party: "+" TELANGANA RASHTRA SAMITHI");
            leader.setForeground(Color.RED);
            party.setForeground(Color.RED);
            leader.setFont(font);
            party.setFont(font);
        }else if(Name == "Pinapaka"){
            dcd.setValue(72283,"Political Party", "INC");
            dcd.setValue(52718,"Political Party", "TRS");
            dcd.setValue(5277,"Political Party", "IND");
            leader.setText("Leader: " + " KANTHA RAO");
            party.setText("Party: "+" INDIAN NATIONAL CONGRESS");
            leader.setForeground(Color.RED);
            party.setForeground(Color.RED);
            leader.setFont(font);
            party.setFont(font);
        }else if(Name == "Quthbullapur"){
            dcd.setValue(154500,"Political Party", "TRS");
            dcd.setValue(113000,"Political Party", "INC");
            dcd.setValue(9833,"Political Party", "BJP");
            leader.setText("Leader: " + " VIVEKANANDA");
            party.setText("Party: "+" TELANGANA RASHTRA SAMITHI");
            leader.setForeground(Color.RED);
            party.setForeground(Color.RED);
            leader.setFont(font);
            party.setFont(font);
        }else if(Name == "Rajendranagar"){
            dcd.setValue(108964,"Political Party", "TRS");
            dcd.setValue(50591,"Political Party", "TDP");
            dcd.setValue(46547,"Political Party", "AIMIM");
            leader.setText("Leader: " + " PRAKASH GOUD");
            party.setText("Party: "+" TELANGANA RASHTRA SAMITHI");
            leader.setForeground(Color.RED);
            party.setForeground(Color.RED);
            leader.setFont(font);
            party.setFont(font);
        }else if(Name == "Ramagundam"){
            dcd.setValue(61400,"Political Party", "AIFB");
            dcd.setValue(34981,"Political Party", "TRS");
            dcd.setValue(27181,"Political Party", "INC");
            leader.setText("Leader: " + " CHANDRA PATEL");
            party.setText("Party: "+" ALL INDIA FORWARD BALOC");
            leader.setForeground(Color.RED);
            party.setForeground(Color.RED);
            leader.setFont(font);
            party.setFont(font);
        }else if(Name == "Sanath Nagar"){
            dcd.setValue(66464,"Political Party", "TRS");
            dcd.setValue(35813,"Political Party", "TDP");
            dcd.setValue(14247,"Political Party", "BJP");
            leader.setText("Leader: " + " SRINIVAS YADAV");
            party.setText("Party: "+" TELANGANA RASHTRA SAMITHI");
            leader.setForeground(Color.RED);
            party.setForeground(Color.RED);
            leader.setFont(font);
            party.setFont(font);
        }else if(Name == "Sangareddy"){
            dcd.setValue(76572,"Political Party", "INC");
            dcd.setValue(73983,"Political Party", "TRS");
            dcd.setValue(7628,"Political Party", "BJP");
            leader.setText("Leader: " + " JAI PRAKASH REDDY");
            party.setText("Party: "+" INDIAN NATIONAL CONGRESS");
            leader.setForeground(Color.RED);
            party.setForeground(Color.RED);
            leader.setFont(font);
            party.setFont(font);
        }else if(Name == "Sathupalli"){
            dcd.setValue(100044,"Political Party", "TDP");
            dcd.setValue(81042,"Political Party", "TRS");
            dcd.setValue(7345,"Political Party", "IND");
            leader.setText("Leader: " + " VENKATA VEERAIAH");
            party.setText("Party: "+" TELUGU DESAM PARTY");
            leader.setForeground(Color.RED);
            party.setForeground(Color.RED);
            leader.setFont(font);
            party.setFont(font);
        }else if(Name == "Secunderabad"){
            dcd.setValue(79309,"Political Party", "TRS");
            dcd.setValue(33839,"Political Party", "INC");
            dcd.setValue(11781,"Political Party", "BJP");
            leader.setText("Leader: " + " PADMA RAO");
            party.setText("Party: "+" TELANGANA RASHTRA SAMITHI");
            leader.setForeground(Color.RED);
            party.setForeground(Color.RED);
            leader.setFont(font);
            party.setFont(font);
        }else if(Name == "Secunderabad Cantt"){
            dcd.setValue(65797,"Political Party", "TRS");
            dcd.setValue(28234,"Political Party", "INC");
            dcd.setValue(15487,"Political Party", "BJP");
            leader.setText("Leader: " + " SAYANNA");
            party.setText("Party: "+" TELANGANA RASHTRA SAMITHI");
            leader.setForeground(Color.RED);
            party.setForeground(Color.RED);
            leader.setFont(font);
            party.setFont(font);
        }else if(Name == "Serlingampally"){
            dcd.setValue(143307,"Political Party", "TRS");
            dcd.setValue(99012,"Political Party", "TDP");
            dcd.setValue(22106,"Political Party", "BJP");
            leader.setText("Leader: " + " AREKAPUDI GANDHI");
            party.setText("Party: "+" TELANGANA RASHTRA SAMITHI");
            leader.setForeground(Color.RED);
            party.setForeground(Color.RED);
            leader.setFont(font);
            party.setFont(font);
        }else if(Name == "Shadnagar"){
            dcd.setValue(72315,"Political Party", "TRS");
            dcd.setValue(51890,"Political Party", "INC");
            dcd.setValue(27814,"Political Party", "BSP");
            leader.setText("Leader: " + " ANJAIAH YELGANAMONI");
            party.setText("Party: "+" TELANGANA RASHTRA SAMITHI");
            leader.setForeground(Color.RED);
            party.setForeground(Color.RED);
            leader.setFont(font);
            party.setFont(font);
        }else if(Name == "Siddipet"){
            dcd.setValue(131295,"Political Party", "TRS");
            dcd.setValue(12596,"Political Party", "TJS");
            dcd.setValue(11266,"Political Party", "BJP");
            leader.setText("Leader: " + " HARISH RAO");
            party.setText("Party: "+" TELANGANA RASHTRA SAMITHI");
            leader.setForeground(Color.RED);
            party.setForeground(Color.RED);
            leader.setFont(font);
            party.setFont(font);
        }else if(Name == "Sircilla"){
            dcd.setValue(125213,"Political Party", "TRS");
            dcd.setValue(36204,"Political Party", "INC");
            dcd.setValue(3245,"Political Party", "BSP");
            leader.setText("Leader: " + " TARAKA RAMA RAO");
            party.setText("Party: "+" TELANGANA RASHTRA SAMITHI");
            leader.setForeground(Color.RED);
            party.setForeground(Color.RED);
            leader.setFont(font);
            party.setFont(font);
        }else if(Name == "Sirpur"){
            dcd.setValue(83088,"Political Party", "TRS");
            dcd.setValue(59052,"Political Party", "INC");
            dcd.setValue(6279,"Political Party", "BJP");
            leader.setText("Leader: " + " KONERU KONAPPA");
            party.setText("Party: "+" TELANGANA RASHTRA SAMITHI");
            leader.setForeground(Color.RED);
            party.setForeground(Color.RED);
            leader.setFont(font);
            party.setFont(font);
        }else if(Name == "Suryapet"){
            dcd.setValue(68650,"Political Party", "TRS");
            dcd.setValue(62683,"Political Party", "INC");
            dcd.setValue(39240,"Political Party", "BJP");
            leader.setText("Leader: " + " JAGADISH REDDY");
            party.setText("Party: "+" TELANGANA RASHTRA SAMITHI");
            leader.setForeground(Color.RED);
            party.setForeground(Color.RED);
            leader.setFont(font);
            party.setFont(font);
        }else if(Name == "Tandur"){
            dcd.setValue(70428,"Political Party", "INC");
            dcd.setValue(67553,"Political Party", "TRS");
            dcd.setValue(10548,"Political Party", "BJP");
            leader.setText("Leader: " + " ROHIT REDDY");
            party.setText("Party: "+" INDIAN NATIONAL CONGRESS");
            leader.setForeground(Color.RED);
            party.setForeground(Color.RED);
            leader.setFont(font);
            party.setFont(font);
        }else if(Name == "Thungathurthy"){
            dcd.setValue(90857,"Political Party", "TRS");
            dcd.setValue(89010,"Political Party", "INC");
            dcd.setValue(3729,"Political Party", "SFB");
            leader.setText("Leader: " + " KISHORE KUMAR");
            party.setText("Party: "+" TELANGANA RASHTRA SAMITHI");
            leader.setForeground(Color.RED);
            party.setForeground(Color.RED);
            leader.setFont(font);
            party.setFont(font);
        }else if(Name == "Uppal"){
            dcd.setValue(117442,"Political Party", "TRS");
            dcd.setValue(69274,"Political Party", "TDP");
            dcd.setValue(26798,"Political Party", "BJP");
            leader.setText("Leader: " + " SHUBASH REDDY");
            party.setText("Party: "+" TELANGANA RASHTRA SAMITHI");
            leader.setForeground(Color.RED);
            party.setForeground(Color.RED);
            leader.setFont(font);
            party.setFont(font);
        }else if(Name == "Vemulawada"){
            dcd.setValue(84050,"Political Party", "TRS");
            dcd.setValue(55864,"Political Party", "INC");
            dcd.setValue(6592,"Political Party", "BJP");
            leader.setText("Leader: " + " RAMESH CHENNAMANANI");
            party.setText("Party: "+" TELANGANA RASHTRA SAMITHI");
            leader.setForeground(Color.RED);
            party.setForeground(Color.RED);
            leader.setFont(font);
            party.setFont(font);
        }else if(Name == "Vikarabad"){
            dcd.setValue(59971,"Political Party", "TRS");
            dcd.setValue(56879,"Political Party", "INC");
            dcd.setValue(23908,"Political Party", "AIFB");
            leader.setText("Leader: " + " ANANAND METHUKU");
            party.setText("Party: "+" TELANGANA RASHTRA SAMITHI");
            leader.setForeground(Color.RED);
            party.setForeground(Color.RED);
            leader.setFont(font);
            party.setFont(font);
        }else if(Name == "Wanaparthy"){
            dcd.setValue(111956,"Political Party", "TRS");
            dcd.setValue(60271,"Political Party", "INC");
            dcd.setValue(3168,"Political Party", "BJP");
            leader.setText("Leader: " + " NIRANJAN REDDY");
            party.setText("Party: "+" TELANGANA RASHTRA SAMITHI");
            leader.setForeground(Color.RED);
            party.setForeground(Color.RED);
            leader.setFont(font);
            party.setFont(font);
        }else if(Name == "Warangal East"){
            dcd.setValue(83922,"Political Party", "TRS");
            dcd.setValue(55140,"Political Party", "INC");
            dcd.setValue(4729,"Political Party", "BJP");
            leader.setText("Leader: " + " NARENDAR NANNAPUNENI");
            party.setText("Party: "+" TELANGANA RASHTRA SAMITHI");
            leader.setForeground(Color.RED);
            party.setForeground(Color.RED);
            leader.setFont(font);
            party.setFont(font);
        }else if(Name == "Warangal West"){
            dcd.setValue(81006,"Political Party", "TRS");
            dcd.setValue(44555,"Political Party", "TDP");
            dcd.setValue(5979,"Political Party", "BJP");
            leader.setText("Leader: " + " VINAY BHASKER");
            party.setText("Party: "+" TELANGANA RASHTRA SAMITHI");
            leader.setForeground(Color.RED);
            party.setForeground(Color.RED);
            leader.setFont(font);
            party.setFont(font);
        }else if(Name == "Wardhanapet"){
            dcd.setValue(131252,"Political Party", "TRS");
            dcd.setValue(32012,"Political Party", "TJS");
            dcd.setValue(6107,"Political Party", "CPI");
            leader.setText("Leader: " + " AROORI RAMESH");
            party.setText("Party: "+" TELANGANA RASHTRA SAMITHI");
            leader.setForeground(Color.RED);
            party.setForeground(Color.RED);
            leader.setFont(font);
            party.setFont(font);
        }else if(Name == "Wyra"){
            dcd.setValue(52650,"Political Party", "IND");
            dcd.setValue(50637,"Political Party", "TRS");
            dcd.setValue(32757,"Political Party", "CPI");
            leader.setText("Leader: " + " LAVUDYA RAMULU");
            party.setText("Party: "+" INDIAN NATIONAL DEMOCRATIC");
            leader.setForeground(Color.RED);
            party.setForeground(Color.RED);
            leader.setFont(font);
            party.setFont(font);
        }else if(Name == "Yakutpura"){
            dcd.setValue(69595,"Political Party", "AIMIM");
            dcd.setValue(22617,"Political Party", "TRS");
            dcd.setValue(22122,"Political Party", "MBT");
            leader.setText("Leader: " + " AHMED PASHA");
            party.setText("Party: "+" AIMIM");
            leader.setForeground(Color.RED);
            party.setForeground(Color.RED);
            leader.setFont(font);
            party.setFont(font);
        }else if(Name == "Yellandu"){
            dcd.setValue(70644,"Political Party", "INC");
            dcd.setValue(67757,"Political Party", "TRS");
            dcd.setValue(12899,"Political Party", "IND");
            leader.setText("Leader: " + " HARIPRIYA BANOTH");
            party.setText("Party: "+" INDIAN NATIONAL CONGRESS");
            leader.setForeground(Color.RED);
            party.setForeground(Color.RED);
            leader.setFont(font);
            party.setFont(font);
        }else if(Name == "Yellareddy"){
            dcd.setValue(91510,"Political Party", "INC");
            dcd.setValue(56362,"Political Party", "TRS");
            dcd.setValue(9684,"Political Party", "IND");
            leader.setText("Leader: " + " JAJALA SURENDAR");
            party.setText("Party: "+" INDIAN NATIONAL CONGRESS");
            leader.setForeground(Color.RED);
            party.setForeground(Color.RED);
            leader.setFont(font);
            party.setFont(font);
        }else if(Name == "Zahirabad"){
            dcd.setValue(96598,"Political Party", "TRS");
            dcd.setValue(62125,"Political Party", "INC");
            dcd.setValue(19454,"Political Party", "BJP");
            leader.setText("Leader: " + " KONINTI MANIK RAO");
            party.setText("Party: "+" TELANGANA RASHTRA SAMITHI");
            leader.setForeground(Color.RED);
            party.setForeground(Color.RED);
            leader.setFont(font);
            party.setFont(font);
        }         
    }    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TSResults.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TSResults.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TSResults.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TSResults.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {   
                new TSResults().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel consLabel;
    private javax.swing.JLabel headingLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel leader;
    private javax.swing.JComboBox<String> locName;
    private javax.swing.JLabel party;
    private javax.swing.JPanel reportPanel;
    private javax.swing.JButton resultButton;
    private javax.swing.JPanel textPanel;
    // End of variables declaration//GEN-END:variables
}
