using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace MatchingGame
{
    public partial class MatchingGame : Form
    {
        // used to create random objects in webding form

        Random random = new Random();
        List<string> icons = new List<string>()
        {
            "!", "!", "@", "@", "(", "(", "$", "$",
            "%", "%", "-", "-", "k", "k", "=", "="
        };

        Label firstClicked = null;

        // secondClicked points to the second Label control that the player clicks

        Label secondClicked = null;

        public MatchingGame()
        {
            InitializeComponent();
            AssignIconsToSquares();
        }

        private void MatchingGame_Load(object sender, EventArgs e)
        {

        }

        private void AssignIconsToSquares()
        {
            // assigning icon to a random square
            foreach (Control c in tableLayoutPanel1.Controls)
            {
                Label icon = c as Label;
                if (icon != null)
                {
                    int randomNumber = random.Next(icons.Count);
                    icon.Text = icons[randomNumber];
                    icon.ForeColor = icon.BackColor;
                    icons.RemoveAt(randomNumber);
                }
            }
        }

        // Add a Click Event Handler to Each Label

        private void label_Click(object sender, EventArgs e)
        {
            // The timer is only on after two non-matching icons

            if (timer1.Enabled == true)
                return;

            Label clickedLabel = sender as Label;

            if (clickedLabel != null)
            {
                // If the clicked label is black, the player clicked an icon that is reveal-- ignore the click

                if (clickedLabel.ForeColor == Color.Black)
                    return;

                // If firstClicked is null, this is the first icon in the pair that the player clicked, so set 
                // firstClicked to the label that the player clicked, change its color to black, and return

                if (firstClicked == null)
                {
                    firstClicked = clickedLabel;
                    firstClicked.ForeColor = Color.Black;
                    return;
                }

                // If the player gets this far, the timer isn't running and firstClicked isn't null,
                // so this must be the second icon the player clicked Set its color to black

                secondClicked = clickedLabel;
                secondClicked.ForeColor = Color.Black;

                // Check to see if the player won

                CheckForWinner();

                if (firstClicked.Text == secondClicked.Text)
                {
                    firstClicked = null;
                    secondClicked = null;
                    return;
                }

                // If the player gets this far, the player clicked two different icons, so start the 
                // timer (which will wait three quarters of a second, and then hide the icons)

                timer1.Start();
            }
            }

            private void timer1_Tick(object sender, EventArgs e)
            {
                // Stop the timer
                timer1.Stop();

                // Hide both icons
                firstClicked.ForeColor = firstClicked.BackColor;
                secondClicked.ForeColor = secondClicked.BackColor;

            // Reset firstClicked and secondClicked so the next time a label is 
            // clicked, the program knows it's the first click
                firstClicked = null;
                secondClicked = null;

            }

        private void CheckForWinner()
        {
            // Go through all of the labels checking each one to see if its icon is matched

            foreach (Control control in tableLayoutPanel1.Controls)
            {
                Label iconLabel = control as Label;

                if (iconLabel != null)
                {
                    if (iconLabel.ForeColor == iconLabel.BackColor)
                        return;
                }
            }

            // If the loop didn’t return, it didn't find any unmatched icons That means the user won.
            MessageBox.Show("You matched all the icons!", "Congratulations");
            Close();
        }

    }
}
