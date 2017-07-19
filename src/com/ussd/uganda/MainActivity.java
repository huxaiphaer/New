package com.ussd.uganda;

import java.util.Scanner;

import model.Model;

public class MainActivity extends AccountInformation implements OperationsInterface {

	private static String shortcode = "";

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {

			EnterShortCode();

		} catch (Exception e) {
			// TODO: handle exception

			System.out.println("Invalid input , please type in correct characters !!!");

			LoopBack();
		}

		// OnLoad();

	}

	void SecurityMenu() {
	}

	public static void EnterShortCode() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the short Code : ");
		shortcode = sc.next();

		if (shortcode.contentEquals("*912#")) {
			if (!CheckPassword().isEmpty()) {

				OnMenu();
			}

			else {
				Scanner s = new Scanner(System.in);
				System.out.println("Hello " + GetAccountName() + "," + " Welcome to Mobile Kibiina " + "");
				System.out.println("Choose Your Pin");
				String sec = s.next();

				System.out.println("Confirm Your Pin");

				String sec2 = s.next();

				if (sec.equalsIgnoreCase(sec2)) {

					InsertPassword(sec2);

					Subscription();

					// EnterShortCode();
					OnMenu();

				}

				else {

					System.out.println("Please Customer passwords do not match !" + "");

					LoopBack();

				}

			}

		}

		else {
			System.out.println("This is an invalid code , please try again\n\n\n");
			System.out.println("Enter the short Code : ");
			shortcode = sc.next();
			if (shortcode.contentEquals("*912#")) {

				OnMenu();

			}

			else {
				System.out.println("This is an invalid code , please try again\n\n\n");
				System.out.println("Enter the short Code : ");
				shortcode = sc.next();
				if (shortcode.contentEquals("*912#")) {

					OnMenu();

				}

			}
			// EnterCodeMeassage();

		}
	}

	public static void LoopBack() {
		EnterShortCode();
	}

	public static void OnLoadAirtime(double Amount) {

		Scanner sc = new Scanner(System.in);
		System.out.println(
				"Load Airtime  E.g For 500ugx *130*1257384879#, 2000ugx *130*123456789#\t\t\t For 1000ugx *130*1234567879# \n"
						+ "5000ugx *130*1294567879#  , 10,000 ugx *130*2394567879# , 20,000" + "ugx *130*5672567879#");
		String at = sc.next();
		double AT_1 = 2000.0;
		double AT_2 = 1000.0;
		double AT_3 = 5000;
		double AT_4 = 10000;
		double AT_5 = 20000;
		double AT_6 = 500;
		double final_AT;
		double final_AT2;
		double final_AT3;
		double final_AT4;
		double final_AT5;
		double PackageAmount;
		double Airtime;
		if (at.contentEquals("*130*123456789#")) {

			final_AT = AT_1 - Amount;
			InsertAT(AT_1);
			PackageAmount = Double.parseDouble(GetPackageAmount());
			Airtime = Double.parseDouble(GetAirtime());

			// if you are subscribed.

			if (Airtime > PackageAmount && PackageAmount != 0) {

				System.out.println(
						"Dear Customer, you Have " + " Successfully Recharged your " + "account with  2000/= \n \n\n");

				PackageAmount = Double.parseDouble(GetPackageAmount());

				Transaction(Amount);

				System.out.println("Dear Customer , you have been deducted " + Amount
						+ " ,your Airtime  balance is now " + (GetAirtime()) + "/=");

				LoopBack();
			}

			else if (Airtime <= PackageAmount) {

				System.out.println("Dear Customer, you have " + " successfully recharged your "
						+ "account with  2000/= your airtime balance is " + GetAirtime() + "/=");
				LoopBack();

			}

			else {
				System.out.println("Dear Customer, you have " + " successfully recharged your "
						+ "account with  2000/= your airtime balance is " + GetAirtime() + "/=");
				LoopBack();
			}

		}

		else if (at.contentEquals("*130*1257384879#")) {
			InsertAT(AT_6);
			PackageAmount = Double.parseDouble(GetPackageAmount());
			Airtime = Double.parseDouble(GetAirtime());

			if (Airtime > PackageAmount && PackageAmount != 0) {

				System.out.println(
						"Dear Customer, you Have " + " Successfully Recharged your " + "account with  500/= \n \n\n");

				Transaction(Amount);
				// AddAirtimeAsync(final_AT2);
				System.out.println("Dear Customer , You have been deducted " + Amount + " Your Airtime balance is now "
						+ (GetAirtime()) + "/=");

				LoopBack();
			}

			else if (Airtime <= PackageAmount) {
				System.out.println("Dear Customer, you Have " + " Successfully Recharged your "
						+ "account with  500/=  your airtime balance is " + GetAirtime() + "/=");
				LoopBack();

			}

			else {
				System.out.println("Dear Customer, you Have " + " Successfully Recharged your "
						+ "account with  500/=  your airtime balance is " + GetAirtime() + "/=");
				LoopBack();
			}

		}

		else if (at.contentEquals("*130*1234567879#")) {
			InsertAT(AT_2);
			PackageAmount = Double.parseDouble(GetPackageAmount());
			Airtime = Double.parseDouble(GetAirtime());
			final_AT2 = AT_2 - Amount;

			if (Airtime > PackageAmount && PackageAmount != 0) {

				System.out.println(
						"Dear Customer, you Have " + " Successfully Recharged your " + "account with  1000/= \n \n\n");

				Transaction(Amount);
				// AddAirtimeAsync(final_AT2);
				System.out.println("Dear Customer , You have been deducted " + Amount + " Your Airtime balance is now "
						+ (GetAirtime()) + "/=");

				LoopBack();
			}

			else if (Airtime <= PackageAmount) {
				System.out.println("Dear Customer, you Have " + " Successfully Recharged your "
						+ "account with  1000/=  your airtime balance is " + GetAirtime() + "/=");
				LoopBack();

			}

			else {
				System.out.println("Dear Customer, you Have " + " Successfully Recharged your "
						+ "account with  1000/=  your airtime balance is " + GetAirtime() + "/=");
				LoopBack();
			}

		}

		else if (at.contentEquals("*130*1294567879#")) {

			InsertAT(AT_3);
			PackageAmount = Double.parseDouble(GetPackageAmount());
			Airtime = Double.parseDouble(GetAirtime());
			final_AT3 = AT_3 - Amount;

			if (Airtime > PackageAmount && PackageAmount != 0) {
				System.out.println(
						"Dear Customer, you Have " + " Successfully Recharged your " + "account with  5000/= \n \n\n");

				Transaction(Amount);
				// AddAirtimeAsync(final_AT2);
				System.out.println("Dear Customer , You have been deducted " + Amount + " Your Airtime balance is now "
						+ (GetAirtime()) + "/=");

				LoopBack();
			}

			else if (Airtime <= PackageAmount) {
				System.out.println("Dear Customer, you Have " + " Successfully Recharged your "
						+ "account with  5000/=  your airtime balance is  " + GetAirtime() + "/=");
				LoopBack();
			}

			else {

				System.out.println("Dear Customer, you Have " + " Successfully Recharged your "
						+ "account with  5000/=  your airtime balance is  " + GetAirtime() + "/=");
				LoopBack();
			}
		}

		else if (at.contentEquals("*130*2394567879#")) {
			InsertAT(AT_4);
			PackageAmount = Double.parseDouble(GetPackageAmount());
			Airtime = Double.parseDouble(GetAirtime());
			if (Airtime > PackageAmount && PackageAmount != 0) {
				System.out.println("Dear Customer, you Have " + " Successfully Recharged your "
						+ "account with  10,000/= \n \n\n");

				Transaction(Amount);
				// AddAirtimeAsync(final_AT2);
				System.out.println("Dear Customer , You have been deducted " + Amount + " Your Airtime balance is now "
						+ (GetAirtime()) + "/=");

				LoopBack();
			} else if (Airtime <= PackageAmount) {
				System.out.println("Dear Customer, you Have " + " Successfully Recharged your "
						+ "account with  10,000/=  your airtime balance is " + GetAirtime() + "/=");
				LoopBack();

			}

			else {
				System.out.println("Dear Customer, you Have " + " Successfully Recharged your "
						+ "account with  10,000/=  your airtime balance is " + GetAirtime() + "/=");
				LoopBack();

			}

		}

		else if (at.contentEquals("*130*5672567879#")) {
			InsertAT(AT_5);
			PackageAmount = Double.parseDouble(GetPackageAmount());
			Airtime = Double.parseDouble(GetAirtime());
			if (Airtime > PackageAmount && PackageAmount != 0) {
				System.out.println("Dear Customer, you Have " + " Successfully Recharged your "
						+ "account with  20,000/= \n \n\n");

				Transaction(Amount);
				// AddAirtimeAsync(final_AT2);
				System.out.println("Dear Customer , You have been deducted " + Amount + " Your Airtime balance is now "
						+ (GetAirtime()) + "/=");

				LoopBack();
			}

			else if (Airtime <= PackageAmount) {

				System.out.println("Dear Customer, you Have " + " Successfully Recharged your "
						+ "account with  20,000/= your airtime balance is " + GetAirtime() + "/=");
				LoopBack();
			}

			else {

				System.out.println("Dear Customer, you Have " + " Successfully Recharged your "
						+ "account with  20,000/= your airtime balance is " + GetAirtime() + "/=");
				LoopBack();

			}
		}

	}

	// Menu of USSD
	public static void OnMenu() {
		Scanner sc = new Scanner(System.in);

		Scanner menu = new Scanner(System.in);
		System.out.println(
				"1.Subscribe\n2.Withdraw\n3.Account Info\n4.Unsubscribe\n5.More\n*6. Load Airtime\n*7. Reset System\n*8.Check Airtime "
						+ " ");
		System.out.println("Choose to select on the options");
		String menu_selector = menu.next();

		// Select Subscription on the Menu
		if (menu_selector.contentEquals("1")) {

			System.out.println("1.Ordinary\n2.VIP\n3.VVIP\n\n");

			String code3 = sc.next();
			if (code3.contentEquals("1"))

			{
				System.out.println("Choose amount for Ordinary Saving \n 1.500 \n 2.1000");

				String code4 = sc.next();
				if (code4.contentEquals("1"))

				{

					// Checking the package amount if its not empty
					// Inserting package amount

					// Allowing subscription to occur

					System.out.println("Choose Period for Ordinary Saving \n 1.2 Weeks  \n 2.1 Month");
					String ordinary = sc.next();
					if (ordinary.contentEquals("1")) {

						System.out.println("Confirm with your Pin to Activate 2 weeks");

						String pin2 = sc.next();
						GetPin(pin2);
						if (pin2.contentEquals(GetPin(pin2))) {

							if (GetPackageAmount().equals("0")) {

								InsertPackageAmount(500);
								Subscription();
								SetPackagePeriod(14);

								System.out.println("You have successfully Subscribed on 2 Weeks ");

								Charges c = new Charges(500.0);

								double Amount = c.getAmount();

								AccountInformation a = new AccountInformation();

								// final double Balance = a.setBalance(Amount);

								OnLoadAirtime(Amount);
							}

							else {

								System.out.println("You have already subscribed on Mobile Kibiina "
										+ "with a charge of " + GetPackageAmount() + " /=" + " " + DateWithdraw()
										+ " day(s) left to withdraw");
							}

						}

						else {
							System.out.println("Your password is wrong please try again!! ");
							LoopBack();
						}

					}

					else if (ordinary.contentEquals("2")) {

						// InsertPackageAmount(1000);

						System.out.println("Confirm with your Pin to Activate 1  Month");

						String pin2 = sc.next();
						GetPin(pin2);
						if (pin2.contentEquals(GetPin(pin2))) {

							if (GetPackageAmount().equals("0")) {

								InsertPackageAmount(500);
								Subscription();
								SetPackagePeriod(14);
								System.out.println("You have successfully Subscribed on 1 Month " + " with a charge of "
										+ GetPackageAmount() + "/=");

								// Loading some Airtime
								Charges c = new Charges(1000);
								double Amount = c.getAmount();
								// OnLoadAirtime(Amount);

							}

							else {
								System.out.println("You have already subscribed on Mobile Kibiina "
										+ "with a charge of " + GetPackageAmount() + " /=" + " " + DateWithdraw()
										+ " day(s) left to withdraw");
								LoopBack();

							}
						}

						else {
							System.out.println("Your password is wrong please try again!! ");

							LoopBack();
						}

					}

				} else if (code4.contentEquals("2")) {

					/// InsertPackageAmount(1000);
					System.out.println("Choose Period for Ordinary Saving \n 1.2 Weeks  \n 2.1 Month");
					String ordinary = sc.next();
					if (ordinary.contentEquals("1")) {
						System.out.println("Confirm with your Pin to Activate 2 weeks");

						String pin2 = sc.next();

						GetPin(pin2);
						if (pin2.contentEquals(GetPin(pin2))) {

							if (GetPackageAmount().equals("0")) {

								InsertPackageAmount(1000);
								Subscription();
								SetPackagePeriod(14);

								System.out.println("You have successfully Subscribed on 2 Weeks and a charge of "
										+ GetPackageAmount() + "/=");

								Charges c = new Charges(1000.0);

								double Amount = c.getAmount();

								// OnLoadAirtime(Amount);
								LoopBack();
							}

							else {

								System.out.println("You have already subscribed on Mobile Kibiina "
										+ "with a charge of " + GetPackageAmount() + " /=" + " " + DateWithdraw()
										+ " day(s) left to withdraw");
								LoopBack();
							}
						}

						else {
							System.out.println("Your password is wrong please try again!! ");
							LoopBack();
						}

					} else if (ordinary.contentEquals("2")) {
						System.out.println("Confirm with your Pin to activate 1 Month");
						String pin = sc.next();

						GetPin(pin);

						if (pin.contentEquals(GetPin(pin))) {
							if (GetPackageAmount().equals("0")) {
								InsertPackageAmount(1000);
								Subscription();
								SetPackagePeriod(30);
								System.out.println("You have successfully Subscribed on 1 Month " + " and a charge of "
										+ GetPackageAmount() + "/=");

								Charges c = new Charges(1000.0);

								double Amount = c.getAmount();

								// OnLoadAirtime(Amount);
								LoopBack();
							}

							else {

								System.out.println("You have already subscribed on Mobile Kibiina "
										+ "with a charge of " + GetPackageAmount() + " /=" + " " + DateWithdraw()
										+ " day(s) left to withdraw");
								LoopBack();
							}
						}

						else {
							System.out.println("Your password is wrong please try again!! ");
							LoopBack();
						}
					}

				}

			}

			// Option for VIP
			else if (code3.contentEquals("2")) {

				System.out.println("Choose amount for VIP Saving \n 1.2500 \n 2.5000");

				String code4 = sc.next();
				if (code4.contentEquals("1"))

				{

					// Checking the package amount if its not empty
					// Inserting package amount

					// Allowing subscription to occur

					System.out.println("Choose Period for VIP Saving \n 1.2 Weeks  \n 2.1 Month");
					String ordinary = sc.next();
					if (ordinary.contentEquals("1")) {

						System.out.println("Confirm with your Pin to Activate 2 weeks");

						String pin2 = sc.next();
						GetPin(pin2);
						if (pin2.contentEquals(GetPin(pin2))) {

							if (GetPackageAmount().equals("0")) {

								InsertPackageAmount(2500);
								Subscription();
								SetPackagePeriod(14);

								System.out.println("You have successfully Subscribed on 2 Weeks ");

								Charges c = new Charges(2500.0);

								double Amount = c.getAmount();

								AccountInformation a = new AccountInformation();

								// final double Balance = a.setBalance(Amount);

								// OnLoadAirtime(Amount);
								LoopBack();
							}

							else {

								System.out.println("You have already subscribed on Mobile Kibiina "
										+ "with a charge of " + GetPackageAmount() + " /=" + " " + DateWithdraw()
										+ " day(s) left to withdraw");
							}

						}

						else {
							System.out.println("Your password is wrong please try again!! ");
							LoopBack();
						}

					}

					else if (ordinary.contentEquals("2")) {

						// InsertPackageAmount(1000);

						System.out.println("Confirm with your Pin to Activate 1  Month");

						String pin2 = sc.next();
						GetPin(pin2);
						if (pin2.contentEquals(GetPin(pin2))) {

							if (GetPackageAmount().equals("0")) {

								InsertPackageAmount(2500);
								Subscription();
								SetPackagePeriod(30);
								System.out.println("You have successfully Subscribed on 1 Month " + " with a charge of "
										+ GetPackageAmount() + "/=");

								// Loading some Airtime
								Charges c = new Charges(2500);
								double Amount = c.getAmount();
								// OnLoadAirtime(Amount);
								LoopBack();

							}

							else {
								System.out.println("You have already subscribed on Mobile Kibiina "
										+ "with a charge of " + GetPackageAmount() + " /=" + " " + DateWithdraw()
										+ " day(s) left to withdraw");
								LoopBack();

							}
						}

						else {
							System.out.println("Your password is wrong please try again!! ");

							LoopBack();
						}

					}

				} else if (code4.contentEquals("2")) {

					/// InsertPackageAmount(1000);
					System.out.println("Choose Period for VIP Saving \n 1.2 Weeks  \n 2.1 Month");
					String ordinary = sc.next();
					if (ordinary.contentEquals("1")) {
						System.out.println("Confirm with your Pin to Activate 2 weeks");

						String pin2 = sc.next();

						GetPin(pin2);
						if (pin2.contentEquals(GetPin(pin2))) {

							if (GetPackageAmount().equals("0")) {

								InsertPackageAmount(5000);
								Subscription();
								SetPackagePeriod(14);

								System.out.println("You have successfully Subscribed on 2 Weeks and a charge of "
										+ GetPackageAmount() + "/=");

								Charges c = new Charges(5000.0);

								double Amount = c.getAmount();

								// OnLoadAirtime(Amount);
								LoopBack();
							}

							else {

								System.out.println("You have already subscribed on Mobile Kibiina "
										+ "with a charge of " + GetPackageAmount() + " /=" + " " + DateWithdraw()
										+ " day(s) left to withdraw");
								LoopBack();
							}
						}

						else {
							System.out.println("Your password is wrong please try again!! ");
							LoopBack();
						}

					} else if (ordinary.contentEquals("2")) {
						System.out.println("Confirm with your Pin to activate 1 Month");
						String pin = sc.next();

						GetPin(pin);

						if (pin.contentEquals(GetPin(pin))) {
							if (GetPackageAmount().equals("0")) {
								InsertPackageAmount(5000);
								Subscription();
								SetPackagePeriod(30);
								System.out.println("You have successfully Subscribed on 1 Month " + " and a charge of "
										+ GetPackageAmount() + "/=");

								Charges c = new Charges(1000.0);

								double Amount = c.getAmount();

								// OnLoadAirtime(Amount);
								LoopBack();
							}

							else {

								System.out.println("You have already subscribed on Mobile Kibiina "
										+ "with a charge of " + GetPackageAmount() + " /=" + " " + DateWithdraw()
										+ " day(s) left to withdraw");
								LoopBack();
							}
						}

						else {
							System.out.println("Your password is wrong please try again!! ");
							LoopBack();
						}
					}

				}

			}

			// Option for VVIP
			else if (code3.contentEquals("3")) {

				System.out.println("Choose amount for VVIP Saving \n 1.10000 \n 2.25000");

				String code4 = sc.next();
				if (code4.contentEquals("1"))

				{

					// Checking the package amount if its not empty

					// Inserting package amount

					// Allowing subscription to occur

					System.out.println("Choose Period for VVIP Saving \n 1.2 Weeks  \n 2.1 Month \n" + "3.1 Year ");
					String ordinary = sc.next();
					if (ordinary.contentEquals("1")) {

						if (GetPackageAmount().equals("0")) {

							System.out.println("Confirm with your Pin to Activate 2 weeks");

							String pin2 = sc.next();
							GetPin(pin2);
							if (pin2.contentEquals(GetPin(pin2))) {

								if (GetPackageAmount().equals("0")) {
									InsertPackageAmount(10000);
									Subscription();
									SetPackagePeriod(14);
									System.out.println("You have successfully Subscribed on 2 Weeks ");

									Charges c = new Charges(10000.0);

									double Amount = c.getAmount();

									AccountInformation a = new AccountInformation();

									// final double Balance =
									// a.setBalance(Amount);

									// OnLoadAirtime(Amount);
									LoopBack();
								}

								else {

									System.out.println("You have already subscribed on Mobile Kibiina "
											+ "with a charge of " + GetPackageAmount() + " /=" + " " + DateWithdraw()
											+ " day(s) left to withdraw");
									LoopBack();
								}
							}

							else {
								System.out.println("Your password is wrong please try again!! ");
								LoopBack();
							}
						}

						else {
							System.out.println("You have already subscribed on Mobile Kibiina " + "with a charge of "
									+ GetPackageAmount() + " /=" + " " + DateWithdraw() + " day(s) left to withdraw");

							LoopBack();
						}

					}

					else if (ordinary.contentEquals("2")) {

						if (GetPackageAmount().equals("0")) {
							// InsertPackageAmount(1000);

							System.out.println("Confirm with your Pin to Activate 1  Month");

							String pin2 = sc.next();
							GetPin(pin2);
							if (pin2.contentEquals(GetPin(pin2))) {
								if (GetPackageAmount().equals("0")) {

									Subscription();
									InsertPackageAmount(10000);
									SetPackagePeriod(30);
									System.out.println("You have successfully Subscribed on 1 Month ");
									Charges c = new Charges(10000);
									double Amount = c.getAmount();
									// OnLoadAirtime(Amount);
									LoopBack();
								}

								else {
									System.out.println("You have already subscribed on Mobile Kibiina "
											+ "with a charge of " + GetPackageAmount() + " /=" + " " + DateWithdraw()
											+ " day(s) left to withdraw");

									LoopBack();
								}
							}

							else {
								System.out.println("Your password is wrong please try again!! ");

								LoopBack();
							}
						} else {
							System.out.println("You have already subscribed on Mobile Kibiina " + "with a charge of "
									+ GetPackageAmount() + " /=" + " " + DateWithdraw() + " day(s) left to withdraw");

							LoopBack();
						}
					}

					else if (ordinary.contentEquals("3")) {

						if (GetPackageAmount().equals("0")) {
							// InsertPackageAmount(1000);

							System.out.println("Confirm with your Pin to Activate 1  Year");

							String pin2 = sc.next();
							GetPin(pin2);
							if (pin2.contentEquals(GetPin(pin2))) {
								if (GetPackageAmount().equals("0")) {

									Subscription();
									InsertPackageAmount(10000);
									SetPackagePeriod(365);
									System.out.println("You have successfully Subscribed on 1 Year ");
									Charges c = new Charges(10000);
									double Amount = c.getAmount();
									// OnLoadAirtime(Amount);
									LoopBack();
								}

								else {
									System.out.println("You have already subscribed on Mobile Kibiina "
											+ "with a charge of " + GetPackageAmount() + " /=" + " " + DateWithdraw()
											+ " day(s) left to withdraw");

									LoopBack();
								}
							}

							else {
								System.out.println("Your password is wrong please try again!! ");

								LoopBack();
							}
						} else {
							System.out.println("You have already subscribed on Mobile Kibiina " + "with a charge of "
									+ GetPackageAmount() + " /=" + " " + DateWithdraw() + " day(s) left to withdraw");

							LoopBack();
						}

					}

				}

				// Here VVIP 25000 charge

				else if (code4.contentEquals("2")) {

					// Checking the package amount if its not empty

					// Inserting package amount

					// Allowing subscription to occur

					System.out.println("Choose Period for VVIP Saving \n 1.2 Weeks  \n 2.1 Month \n" + "3.1 Year ");
					String ordinary = sc.next();
					if (ordinary.contentEquals("1")) {

						if (GetPackageAmount().equals("0")) {

							System.out.println("Confirm with your Pin to Activate 2 weeks");

							String pin2 = sc.next();
							GetPin(pin2);
							if (pin2.contentEquals(GetPin(pin2))) {

								if (GetPackageAmount().equals("0")) {
									InsertPackageAmount(25000);
									Subscription();
									SetPackagePeriod(14);
									System.out.println("You have successfully Subscribed on 2 Weeks ");

									Charges c = new Charges(25000.0);

									double Amount = c.getAmount();

									AccountInformation a = new AccountInformation();

									// final double Balance =
									// a.setBalance(Amount);

									// OnLoadAirtime(Amount);
									LoopBack();
								}

								else {

									System.out.println("You have already subscribed on Mobile Kibiina "
											+ "with a charge of " + GetPackageAmount() + " /=" + " " + DateWithdraw()
											+ " day(s) left to withdraw");
									LoopBack();
								}
							}

							else {
								System.out.println("Your password is wrong please try again!! ");
								LoopBack();
							}
						}

						else {
							System.out.println("You have already subscribed on Mobile Kibiina " + "with a charge of "
									+ GetPackageAmount() + " /=" + " " + DateWithdraw() + " day(s) left to withdraw");

							LoopBack();
						}

					}

					else if (ordinary.contentEquals("2")) {

						if (GetPackageAmount().equals("0")) {
							// InsertPackageAmount(1000);

							System.out.println("Confirm with your Pin to Activate 1  Month");

							String pin2 = sc.next();
							GetPin(pin2);
							if (pin2.contentEquals(GetPin(pin2))) {
								if (GetPackageAmount().equals("0")) {

									Subscription();
									InsertPackageAmount(25000);
									SetPackagePeriod(30);
									System.out.println("You have successfully Subscribed on 1 Month ");
									Charges c = new Charges(25000);
									double Amount = c.getAmount();
									// OnLoadAirtime(Amount);
									LoopBack();
								}

								else {
									System.out.println("You have already subscribed on Mobile Kibiina "
											+ "with a charge of " + GetPackageAmount() + " /=" + " " + DateWithdraw()
											+ " day(s) left to withdraw");

									LoopBack();
								}
							}

							else {
								System.out.println("Your password is wrong please try again!! ");

								LoopBack();
							}
						} else {
							System.out.println("You have already subscribed on Mobile Kibiina " + "with a charge of "
									+ GetPackageAmount() + " /=" + " " + DateWithdraw() + " day(s) left to withdraw");

							LoopBack();
						}
					}

					else if (ordinary.contentEquals("3")) {

						if (GetPackageAmount().equals("0")) {
							// InsertPackageAmount(1000);

							System.out.println("Confirm with your Pin to Activate 1  Year");

							String pin2 = sc.next();
							GetPin(pin2);
							if (pin2.contentEquals(GetPin(pin2))) {
								if (GetPackageAmount().equals("0")) {

									Subscription();
									InsertPackageAmount(25000);
									SetPackagePeriod(365);
									System.out.println("You have successfully Subscribed on 1 Year ");
									Charges c = new Charges(25000);
									double Amount = c.getAmount();
									// OnLoadAirtime(Amount);
									LoopBack();
								}

								else {
									System.out.println("You are already subscribed on Mobile Kibiina "
											+ "with a charge of " + GetPackageAmount() + " /=" + " " + DateWithdraw()
											+ " day(s) left to withdraw");

									LoopBack();
								}
							}

							else {
								System.out.println("Your password is wrong please try again!! ");

								LoopBack();
							}
						} else {
							System.out.println("You are already subscribed on Mobile Kibiina " + "with a charge of "
									+ GetPackageAmount() + " /=" + " " + DateWithdraw() + " day(s) left to withdraw");

							LoopBack();
						}

					}

				}

			}

		}

		else if (menu_selector.contentEquals("2")) {

			System.out.println("1.Transfer to Mobile Money\n 2.Continue Saving");
			Scanner s = new Scanner(System.in);
			String m = s.next();

			int packageperiod = Integer.parseInt(GetPackagePeriod());

			if (m.contentEquals("1")) {

				System.out.println("Enter Amount to Transfer");
				double amount = s.nextDouble();
				// double a = Double.parseDouble(amount);
				double acc_bal = Double.parseDouble(AccoutBalance());
				if (amount > acc_bal) {

					System.out.println("Insufficent Balance , please try initiating again ");
					LoopBack();
				}

				else if (packageperiod != 0) {

					System.out.println(
							"You can't transfer your credit to Mobile Money you still have a remaining period of  "
									+ GetPackagePeriod() + "day(s)");
					LoopBack();

				} else {
					System.out.println("Confirm With Your Pin");
					String pin = s.next();

					if (pin.contentEquals(GetPin(pin))) {

						TransferSavingCredit(amount);
						System.out.println("This " + amount
								+ " Ugx  Has been transfered to Mobile Money Successfully , your remaining mobile kibiina is "
								+ AccoutBalance() + "/=");
						LoopBack();

					}

					else {

						System.out.println("Incorrect Password Please Try Again");
						LoopBack();
					}
				}
			} else {

				System.out.println("Press 'Y' to continue Saving ");
				String amount = s.next();
				LoopBack();
			}

		}

		// Load Airtime
		else if (menu_selector.contentEquals("6")) {

			double pa = Double.parseDouble(GetPackageAmount());
			double AT = Double.parseDouble(GetAirtime());

			if (!CheckSubscription().equals("0")) {

				// OnLoadAirtime(0);
				OnLoadAirtime(pa);

			}

			if (!(pa > AT)) {

				OnLoadAirtime(pa);
			}

			else {

				OnLoadAirtime(0);
			}
		}

		// This is the More Option

		else if (menu_selector.contentEquals("5")) {
			System.out.println("1.Save all \n 2.Change pin");
			Scanner m = new Scanner(System.in);
			String save_change = m.next();

			// save all request
			if (save_change.contentEquals("1")) {

				System.out.println("Are you sure , you want to save all your Airtime "
						+ " \n1.Press 1 to save all your airtime.\n2.press 2 to cancel ");
				Scanner mm = new Scanner(System.in);
				String con = mm.next();
				if (con.contentEquals("1")) {

					if (GetAirtime().contentEquals("0")) {
						System.out.println("You have no airtime Credit , First recharge please");
						LoopBack();

					}

					else {
						SaveAllAirtimeToMobileKibiina();
						System.out.println("You have successfully saved all " + "airtime as Mobile Kibiina credit.");
						LoopBack();
					}
				}

				// neglecting saving all
				else {
					System.out.println("You have Cancelled the request ");
					LoopBack();

				}

			}

			else if (save_change.contentEquals("2")) {

				if (!CheckPassword().isEmpty()) {

					System.out.println("Enter Your Current   Password");
					String old_pass = sc.next();

					if (!old_pass.equals(CheckPassword())) {
						System.out.println("Invalid Password ,Please Try Again");
					}

					else {
						System.out.println("Choose Your Password");
						String sec = sc.next();

						System.out.println("Confirm Your Pin");

						String sec2 = sc.next();

						if (sec.equalsIgnoreCase(sec2)) {

							InsertPassword(sec2);

							LoopBack();

						}
					}
				} else {

					System.out.println("Choose Your New  Password");
					String p = sc.next();

					System.out.println("Confirm Your Pin");

					String p2 = sc.next();

					if (p.equalsIgnoreCase(p2)) {

						InsertPassword(p);

						LoopBack();

					}

				}

			}

		}

		// checking your airtime

		else if (menu_selector.contentEquals("8")) {

			System.out.println("Your airtime is " + GetAirtime() + "/= \n");

			LoopBack();

		}

		// put here below code ...
		else if (menu_selector.contentEquals("2")) {

			System.out.println("1.Transfer to Mobile Money\n 2.Continue Saving");
			Scanner s = new Scanner(System.in);
			String m = s.next();

			if (m.contentEquals("1")) {

				if (!DateWithdraw().equals("0"))

				{
					System.out.println("You can't withdraw Money from Mobile Kibiina " + "you are left with "
							+ DateWithdraw() + " day(s) to withdraw");
					LoopBack();
				} else {

					System.out.println("Enter Amount to Transfer");
					String amount = s.next();

					System.out.println("Confirm With Your Pin");
					String pin = s.next();

					if (pin.contentEquals(GetPin(pin))) {

						double amount_ = Double.parseDouble(amount);
						double AccBal = Double.parseDouble(AccoutBalance());

						if (amount_ >= AccBal) {

							System.out.println("Insufficient Balance !!");
						}

					}

					else {

						System.out.println("Incorrect Password Please Try Again");
						LoopBack();
					}
				}

			}

		}

		// Reset

		if (menu_selector.contentEquals("7")) {
			Scanner sub = new Scanner(System.in);
			System.out.println("Reset all the System by Pressing \n 1.Press 1 to reset");

			String subscribe = sub.nextLine();

			if (subscribe.contentEquals("1")) {

				Reset();
				LoopBack();

			}

		}

		if (menu_selector.contentEquals("3")) {

			System.out.println("Your Mobile Kibiina  Saving  Credit  is " + AccoutBalance() + " ugx"
					+ " and you are subcribed on a Package charge of " + GetPackageAmount() + " ugx"
					+ " per airtime recharge");

			System.out.println("You are left with " + DateWithdraw() + " day(s) to withdraw");

			LoopBack();
		}

		if (menu_selector.contentEquals("4")) {

			Scanner sub = new Scanner(System.in);

			System.out.print("Do you wish to Unsubscribe ? , \n 1. press 1 to unsubscribe\n");

			String subscribe = sub.nextLine();

			if (subscribe.contentEquals("1")) {
				if (DateWithdraw().equals("0")) {

					Unsubscription();
					System.out.print("You have Successfully Unsubscribed from Mobile Kibiina"
							+ " thanks so much for using Mobile Kibiina");

				}

				else {
					System.out.print("Dear customer you can't unsubscribe from " + "Mobile Kibiina " + "there are "
							+ DateWithdraw() + " day(s) left for you to unsubscribe " + "from Mobile Kibiina");
					LoopBack();

				}
			}

		}

		else {

			System.out.print("Invalid selection please , Try again!! \n");
			LoopBack();

		}
	}

	public static void LoopSecurity() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose Your Password");
		String sec = sc.next();

		System.out.println("Confirm Your Pin");

		String sec2 = sc.next();

		if (sec.equalsIgnoreCase(sec2)) {
			InsertPassword(sec2);
			LoopBack();
		}

		else {

			System.out.println("Passwords do not Match Please");
			LoopSecurity();

		}

	}

}
