package KeywordDrivenFramework;

import config.ActionKeywords;
import utility.ExcelUtils;

public class KeywordDrivenLogin {

	public static void main(String[] args) throws Exception {
		String sPath = "C:\\Users\\Tezza\\eclipse-workspace\\ECommerceStore\\src\\ExcelFiles\\KeywordDrivenFramework.xlsx";

		// passing the Excel path and SheetName as arguments to connect with Excel File
		ExcelUtils.setExcelFile(sPath, "Test Steps");

		// This is the loop for reading the values of the column 3(Action Keywords) row by row

		for (int iRow = 1; iRow <= 10; iRow++) {
			// storing value of excel cell in sActionKeyword string variable
			String sActionKeyword = ExcelUtils.getCellData(iRow, 2);

			// comparing value of Excel Cell with all the project keywords
			if (sActionKeyword.equals("openBrowser")) {
				ActionKeywords.openBrowser();
			} else if (sActionKeyword.equals("navigate")) {
				ActionKeywords.navigate();

			}

			else if (sActionKeyword.equals("openLoginpage")) {
				ActionKeywords.openLoginpage();
			}

			else if (sActionKeyword.equals("inputEmail")) {
				ActionKeywords.inputEmail();
			}

			else if (sActionKeyword.equals("inputPassword")) {
				ActionKeywords.inputPassword();
			}

			else if (sActionKeyword.equals("clickLoginbutton")) {
				ActionKeywords.clickLoginbutton();
			}

			else if (sActionKeyword.equals("Logout")) {
				ActionKeywords.Logout();
			}

			else if (sActionKeyword.equals("closeBrowser")) {
				ActionKeywords.closeBrowser();
			}

		}
	}

}
