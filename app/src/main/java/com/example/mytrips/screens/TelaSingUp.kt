package com.example.mytrips.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.mytrips.R
import com.example.mytrips.ui.theme.MyTripsTheme


@Composable
fun GreetingSignUp(controleNavegacao: NavHostController) {
    Box(
        modifier = Modifier
            .fillMaxWidth(),
        contentAlignment = Alignment.TopEnd
    ) {
        Box(
            modifier = Modifier
                .background(
                    color = Color(0xffCF06F0),
                    shape = RoundedCornerShape(bottomStart = 10.dp)
                )
                .size(height = 40.dp, width = 120.dp)
        )
    }

    Column(
        modifier = Modifier.padding(top = 50.dp, start = 0.dp)
    ) {
        Text(
            modifier = Modifier
                .align(Alignment.CenterHorizontally),
            color = Color(0xffCF06F0),
            fontSize = 40.sp,
            fontWeight = FontWeight.ExtraBold,
            text = stringResource(id = R.string.sign_up)
        )

        Text(
            modifier = Modifier
                .align(Alignment.CenterHorizontally),
            color = Color(0xffA09C9C),
            fontSize = 15.sp,
            text = stringResource(id = R.string.create_a_new_account)
        )

        Card(
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .size(height = 120.dp, width = 100.dp)
                .padding(top = 20.dp), shape = CircleShape,
            border = BorderStroke(2.dp, Color(0xffCF06F0))
        ) {

            Image(
                modifier = Modifier
                    .size(height = 120.dp, width = 100.dp)
                    .offset(y = 6.dp),
                painter = painterResource(id = R.drawable.profile),
                contentDescription = ""
            )

        }

        Image(
            modifier = Modifier
                .offset(x = 220.dp, y = -25.dp)
                .size(height = 30.dp, width = 30.dp),
            painter = painterResource(id = R.drawable.camera),
            contentDescription = ""
        )

        Column(
            modifier = Modifier
                .fillMaxHeight()
                .align(Alignment.CenterHorizontally)
        ) {

            var usernameState = remember {
                mutableStateOf("")
            }

            OutlinedTextField(
                value = usernameState.value,
                onValueChange = {
                    usernameState.value = it
                },
                modifier = Modifier
                    .size(width = 350.dp, height = 65.dp)
                    .padding(start = 20.dp, end = 10.dp),
                shape = RoundedCornerShape(10.dp),
                label = { Text(text = stringResource(id = R.string.username)) },
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Filled.Person,
                        contentDescription = "",
                        tint = Color(0xffCF06F0)
                    )

                },
                colors = OutlinedTextFieldDefaults.colors(
                    unfocusedBorderColor = Color(0xffCF06F0),
                    focusedLabelColor = Color(0xffCF06F0),
                    focusedBorderColor = Color(0xffCF06F0)
                )

            )

            var phoneState = remember {
                mutableStateOf("")
            }

            OutlinedTextField(
                value = phoneState.value,
                onValueChange = {
                    phoneState.value = it
                },
                modifier = Modifier
                    .size(width = 350.dp, height = 65.dp)
                    .padding(start = 20.dp, end = 10.dp),
                shape = RoundedCornerShape(10.dp),
                label = { Text(text = stringResource(id = R.string.phone)) },
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Filled.Call,
                        contentDescription = "",
                        tint = Color(0xffCF06F0)
                    )

                },
                colors = OutlinedTextFieldDefaults.colors(
                    unfocusedBorderColor = Color(0xffCF06F0),
                    focusedLabelColor = Color(0xffCF06F0),
                    focusedBorderColor = Color(0xffCF06F0)
                )

            )

            var emailState = remember {
                mutableStateOf("")
            }

            OutlinedTextField(
                value = emailState.value,
                onValueChange = {
                    emailState.value = it
                },
                modifier = Modifier
                    .size(width = 350.dp, height = 65.dp)
                    .padding(start = 20.dp, end = 10.dp),
                shape = RoundedCornerShape(10.dp),
                label = { Text(text = stringResource(id = R.string.email)) },
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Filled.Email,
                        contentDescription = "",
                        tint = Color(0xffCF06F0)
                    )

                },
                colors = OutlinedTextFieldDefaults.colors(
                    unfocusedBorderColor = Color(0xffCF06F0),
                    focusedLabelColor = Color(0xffCF06F0),
                    focusedBorderColor = Color(0xffCF06F0)
                )
            )

            var passwordState = remember {
                mutableStateOf("")
            }

            OutlinedTextField(
                value = passwordState.value,
                onValueChange = {
                    passwordState.value = it
                },
                modifier = Modifier
                    .size(width = 350.dp, height = 65.dp)
                    .padding(start = 20.dp, end = 10.dp),
                shape = RoundedCornerShape(10.dp),
                label = { Text(text = stringResource(id = R.string.password_sign_up)) },
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Filled.Lock,
                        contentDescription = "",
                        tint = Color(0xffCF06F0)
                    )

                },
                colors = OutlinedTextFieldDefaults.colors(
                    unfocusedBorderColor = Color(0xffCF06F0),
                    focusedLabelColor = Color(0xffCF06F0),
                    focusedBorderColor = Color(0xffCF06F0)
                )
            )

            var overState = remember {
                mutableStateOf(false)
            }

            Row {
                Checkbox(
                    modifier = Modifier
                        .offset(y = 18.dp, x = 24.dp),
                    checked = overState.value, onCheckedChange = {
                        overState.value = it
                    },
                    colors = CheckboxDefaults.colors(
                        checkedColor = Color(0xffCF06F0),
                        uncheckedColor = Color(0xffCF06F0)
                    )
                )

                Text(
                    modifier = Modifier.padding(top = 30.dp, start = 20.dp),
                    fontSize = 17.sp,
                    text = stringResource(id = R.string.over_18)
                )
            }

            Button(modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .size(height = 80.dp, width = 330.dp)
                .padding(top = 30.dp),
                shape = RoundedCornerShape(10.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xffCF06F0)),
                onClick = { /*TODO*/ }) {
                Text(
                    modifier = Modifier,
                    fontWeight = FontWeight.ExtraBold,
                    fontSize = 16.sp,
                    text = stringResource(id = R.string.create_account)
                )
            }

            Row(
                modifier = Modifier
                    .align(Alignment.End)
                    .padding(end = 30.dp, top = 10.dp)
            ) {
                Text(
                    modifier = Modifier
                        .padding(end = 12.dp),
                    color = Color(0xffA09C9C),
                    text = stringResource(id = R.string.already_have_an_account)
                )

                Text(
                    modifier = Modifier,
                    color = Color(0xffCF06F0),
                    fontWeight = FontWeight.ExtraBold,
                    text = stringResource(id = R.string.sign_in_sign_up)
                )
            }

            Box(
                contentAlignment = Alignment.BottomStart,
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight()
            ) {
                Box(
                    modifier = Modifier
                        .background(
                            color = Color(0xffCF06F0), shape = RoundedCornerShape(topEnd = 10.dp)
                        )
                        .size(height = 40.dp, width = 120.dp)
                )
            }

        }
    }
}


@Preview(showSystemUi = true)
@Composable
fun TelaSingUp() {
    MyTripsTheme {
        Surface(
            modifier = Modifier.fillMaxSize()
        ) {
            GreetingSignUp(controleNavegacao = rememberNavController())
        }
    }
}